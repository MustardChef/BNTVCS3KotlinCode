package com.lagradost.cloudstream3.p041ui.download

import android.view.View
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EasyDownloadButton.kt */
@Metadata(
    m108d1 = ["\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"],
    m107d2 = ["<anonymous>", "", "downloadData", "Lkotlin/Triple;", "", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.download.EasyDownloadButton$setUpDownloadButton$1 */ /* loaded from: classes3.dex */
class `EasyDownloadButton$setUpDownloadButton$1` constructor(
    iMinimumData: IMinimumData?,
    longRef: LongRef,
    longRef2: LongRef,
    textView: TextView,
    contentLoadingProgressBar: ContentLoadingProgressBar,
    objectRef: ObjectRef<DownloadType?>,
    z: Boolean,
    booleanRef: BooleanRef,
    function1: Function1<Tuples<Integer?, String?>?, Unit>,
    view: View
) : Lambda<Any?>(1), Function1<Triple<out Integer?, out Long?, out Long?>, Unit> {
    /* synthetic */ val `$currentBytes`: LongRef
    /* synthetic */ val `$data`: IMinimumData?
    /* synthetic */ val `$downloadImageChangeCallback`: Function1<Tuples<Integer?, String?>?, Unit>
    /* synthetic */ val `$downloadView`: View
    /* synthetic */ val `$isTextPercentage`: Boolean
    /* synthetic */ val `$lastState`: ObjectRef<DownloadType>
    /* synthetic */ val `$needImageUpdate`: BooleanRef
    /* synthetic */ val `$progressBar`: ContentLoadingProgressBar
    /* synthetic */ val `$textView`: TextView
    /* synthetic */ val `$totalBytes`: LongRef

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$data` = iMinimumData
        `$currentBytes` = longRef
        `$totalBytes` = longRef2
        `$textView` = textView
        `$progressBar` = contentLoadingProgressBar
        `$lastState` = objectRef
        `$isTextPercentage` = z
        `$needImageUpdate` = booleanRef
        `$downloadImageChangeCallback` = function1
        `$downloadView` = view
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(triple: Triple<out Integer?, out Long?, out Long?>) {
        invoke2(triple as Triple<Integer?, Long?, Long?>)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(downloadData: Triple<Integer?, Long?, Long?>) {
        Intrinsics.checkNotNullParameter(downloadData, "downloadData")
        if (`$data`.getId() == downloadData.getFirst().intValue()) {
            if (downloadData.getSecond()
                    .longValue() === `$currentBytes`.element && downloadData.getThird()
                    .longValue() === `$totalBytes`.element
            ) {
                return
            }
            Coroutines.INSTANCE.runOnMainThread(
                C48481(
                    downloadData,
                    `$data`,
                    `$currentBytes`,
                    `$totalBytes`,
                    `$textView`,
                    `$progressBar`,
                    `$lastState`,
                    `$isTextPercentage`,
                    `$needImageUpdate`,
                    `$downloadImageChangeCallback`,
                    `$downloadView`
                )
            )
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EasyDownloadButton.kt */
    @Metadata(
        m108d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"],
        m107d2 = ["<anonymous>", "", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.download.EasyDownloadButton$setUpDownloadButton$1$1 */ /* loaded from: classes3.dex */
    class C48481 internal constructor(
        triple: Triple<Integer?, Long?, Long?>,
        iMinimumData: IMinimumData?,
        longRef: LongRef,
        longRef2: LongRef,
        textView: TextView,
        contentLoadingProgressBar: ContentLoadingProgressBar,
        objectRef: ObjectRef<DownloadType?>,
        z: Boolean,
        booleanRef: BooleanRef,
        function1: Function1<Tuples<Integer?, String?>?, Unit>,
        view: View
    ) : Lambda<Any?>(0), Functions<Unit> {
        /* synthetic */ val `$currentBytes`: LongRef
        /* synthetic */ val `$data`: IMinimumData?
        /* synthetic */ val `$downloadData`: Triple<Integer?, Long?, Long?>
        /* synthetic */ val `$downloadImageChangeCallback`: Function1<Tuples<Integer?, String?>?, Unit>
        /* synthetic */ val `$downloadView`: View
        /* synthetic */ val `$isTextPercentage`: Boolean
        /* synthetic */ val `$lastState`: ObjectRef<DownloadType>
        /* synthetic */ val `$needImageUpdate`: BooleanRef
        /* synthetic */ val `$progressBar`: ContentLoadingProgressBar
        /* synthetic */ val `$textView`: TextView
        /* synthetic */ val `$totalBytes`: LongRef

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$downloadData` = triple
            `$data` = iMinimumData
            `$currentBytes` = longRef
            `$totalBytes` = longRef2
            `$textView` = textView
            `$progressBar` = contentLoadingProgressBar
            `$lastState` = objectRef
            `$isTextPercentage` = z
            `$needImageUpdate` = booleanRef
            `$downloadImageChangeCallback` = function1
            `$downloadView` = view
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */  override fun invoke() {
            invoke2()
            return Unit.INSTANCE
        }

        @Override // kotlin.jvm.functions.Functions
                /* renamed from: invoke  reason: avoid collision after fix types in other method */    fun invoke2() {
            EasyDownloadButton.Companion.`setUpDownloadButton$fixDownloadedBytes`(
                `$currentBytes`,
                `$totalBytes`,
                `$textView`,
                `$progressBar`,
                `$lastState`,
                `$data`,
                `$isTextPercentage`,
                `$needImageUpdate`,
                `$downloadImageChangeCallback`,
                `$downloadView`,
                `$downloadData`.getSecond().longValue(),
                `$downloadData`.getThird().longValue(),
                true
            )
            EasyDownloadButton.Companion.`setUpDownloadButton$changeDownloadImage`(
                `$lastState`,
                `$currentBytes`,
                `$needImageUpdate`,
                `$downloadImageChangeCallback`,
                `$downloadView`,
                VideoDownloadManager.INSTANCE.getDownloadState(
                    `$data`.getId()
                )
            )
        }
    }
}