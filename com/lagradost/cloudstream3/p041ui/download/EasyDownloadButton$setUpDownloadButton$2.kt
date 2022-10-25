package com.lagradost.cloudstream3.p041ui.download

import android.view.View
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EasyDownloadButton.kt */
@Metadata(
    m108d1 = ["\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"],
    m107d2 = ["<anonymous>", "", "downloadData", "Lkotlin/Pair;", "", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadType;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.download.EasyDownloadButton$setUpDownloadButton$2 */ /* loaded from: classes3.dex */
class `EasyDownloadButton$setUpDownloadButton$2` constructor(
    iMinimumData: IMinimumData?,
    objectRef: ObjectRef<DownloadType?>,
    booleanRef: BooleanRef,
    longRef: LongRef,
    function1: Function1<Tuples<Integer?, String?>?, Unit>,
    view: View
) : Lambda<Any?>(1), Function1<Tuples<out Integer?, out DownloadType>, Unit> {
    /* synthetic */ val `$currentBytes`: LongRef
    /* synthetic */ val `$data`: IMinimumData?
    /* synthetic */ val `$downloadImageChangeCallback`: Function1<Tuples<Integer?, String?>?, Unit>
    /* synthetic */ val `$downloadView`: View
    /* synthetic */ val `$lastState`: ObjectRef<DownloadType>
    /* synthetic */ val `$needImageUpdate`: BooleanRef

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$data` = iMinimumData
        `$lastState` = objectRef
        `$needImageUpdate` = booleanRef
        `$currentBytes` = longRef
        `$downloadImageChangeCallback` = function1
        `$downloadView` = view
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(tuples: Tuples<out Integer?, out DownloadType>) {
        invoke2(tuples as Tuples<Integer?, out DownloadType>)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(downloadData: Tuples<Integer?, out DownloadType>) {
        Intrinsics.checkNotNullParameter(downloadData, "downloadData")
        if (`$data`.getId() == downloadData.getFirst().intValue()) {
            if (`$lastState`.element !== downloadData.getSecond() || `$needImageUpdate`.element) {
                Coroutines.INSTANCE.runOnMainThread(
                    C48491(
                        downloadData,
                        `$lastState`,
                        `$currentBytes`,
                        `$needImageUpdate`,
                        `$downloadImageChangeCallback`,
                        `$downloadView`
                    )
                )
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EasyDownloadButton.kt */
    @Metadata(
        m108d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"],
        m107d2 = ["<anonymous>", "", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.download.EasyDownloadButton$setUpDownloadButton$2$1 */ /* loaded from: classes3.dex */
    class C48491 internal constructor(
        tuples: Tuples<Integer?, out DownloadType>,
        objectRef: ObjectRef<DownloadType?>,
        longRef: LongRef,
        booleanRef: BooleanRef,
        function1: Function1<Tuples<Integer?, String?>?, Unit>,
        view: View
    ) : Lambda<Any?>(0), Functions<Unit> {
        /* synthetic */ val `$currentBytes`: LongRef
        /* synthetic */ val `$downloadData`: Tuples<Integer?, DownloadType>
        /* synthetic */ val `$downloadImageChangeCallback`: Function1<Tuples<Integer?, String?>?, Unit>
        /* synthetic */ val `$downloadView`: View
        /* synthetic */ val `$lastState`: ObjectRef<DownloadType>
        /* synthetic */ val `$needImageUpdate`: BooleanRef

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$downloadData` = tuples
            `$lastState` = objectRef
            `$currentBytes` = longRef
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
            EasyDownloadButton.Companion.`setUpDownloadButton$changeDownloadImage`(
                `$lastState`,
                `$currentBytes`,
                `$needImageUpdate`,
                `$downloadImageChangeCallback`,
                `$downloadView`,
                `$downloadData`.getSecond()
            )
        }
    }
}