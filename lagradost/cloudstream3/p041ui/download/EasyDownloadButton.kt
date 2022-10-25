package com.lagradost.cloudstream3.p041ui.download

import android.animation.ObjectAnimator
import kotlin.jvm.internal.Intrinsics

/* compiled from: EasyDownloadButton.kt */
@Metadata(
    m108d1 = ["\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000c\u001a\u00020\bH\u0016JU\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\u0010\u001aJ\u0081\u0001\u0010\u001b\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u001e\u0010\u001e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\n\u0012\u0004\u0012\u00020\b0\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0002\u0010 \u001a\u00020!H\u0002¢\u0006\u0002\u0010\"JU\u0010#\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\u0010&Jo\u0010'\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010(\u001a\u0004\u0018\u00010\u00152\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\u0010*R.\u0010\u0003\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton;", "Lcom/lagradost/cloudstream3/utils/IDisposable;", "()V", "downloadProgressEventListener", "Lkotlin/Function1;", "Lkotlin/Triple;", "", "", "", "downloadStatusEventListener", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadType;", "dispose", "setUpButton", "setupCurrentBytes", "setupTotalBytes", "progressBar", "Landroidx/core/widget/ContentLoadingProgressBar;", "downloadImage", "Landroid/widget/ImageView;", "textView", "Landroid/widget/TextView;", "data", "Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton\$IMinimumData;", "clickCallback", "Lcom/lagradost/cloudstream3/ui/download/DownloadClickEvent;", "(Ljava/lang/Long;Ljava/lang/Long;Landroidx/core/widget/ContentLoadingProgressBar;Landroid/widget/ImageView;Landroid/widget/TextView;Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton\$IMinimumData;Lkotlin/jvm/functions/Function1;)V", "setUpDownloadButton", "downloadView", "Landroid/view/View;", "downloadImageChangeCallback", "", "isTextPercentage", "", "(Ljava/lang/Long;Ljava/lang/Long;Landroidx/core/widget/ContentLoadingProgressBar;Landroid/widget/TextView;Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton\$IMinimumData;Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "setUpMaterialButton", "downloadButton", "Lcom/google/android/material/button/MaterialButton;", "(Ljava/lang/Long;Ljava/lang/Long;Landroidx/core/widget/ContentLoadingProgressBar;Lcom/google/android/material/button/MaterialButton;Landroid/widget/TextView;Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton\$IMinimumData;Lkotlin/jvm/functions/Function1;)V", "setUpMoreButton", "textViewProgress", "clickableView", "(Ljava/lang/Long;Ljava/lang/Long;Landroidx/core/widget/ContentLoadingProgressBar;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;ZLcom/lagradost/cloudstream3/ui/download/EasyDownloadButton\$IMinimumData;Lkotlin/jvm/functions/Function1;)V", "IMinimumData", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.download.EasyDownloadButton */ /* loaded from: classes3.dex */
class EasyDownloadButton constructor() : IDisposable {
    private var downloadProgressEventListener: Function1<Triple<Integer?, Long?, Long?>?, Unit>? =
        null
    private var downloadStatusEventListener: Function1<Tuples<Integer?, out DownloadType>?, Unit>? =
        null

    /* compiled from: EasyDownloadButton.kt */
    @Metadata(
        m108d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton\$IMinimumData;", "", "id", "", "getId", "()I", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    /* renamed from: com.lagradost.cloudstream3.ui.download.EasyDownloadButton$IMinimumData */ /* loaded from: classes3.dex */
    open interface IMinimumData {
        val id: Int
    }

    /* compiled from: EasyDownloadButton.kt */
    @Metadata(
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.download.EasyDownloadButton$WhenMappings */ /* loaded from: classes3.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

        init {
            val iArr: IntArray = IntArray(VideoDownloadManager.DownloadType.values().size)
            com.lagradost.cloudstream3.p041ui.download.iArr.get(VideoDownloadManager.DownloadType.IsPaused.ordinal()) =
                1
            com.lagradost.cloudstream3.p041ui.download.iArr.get(VideoDownloadManager.DownloadType.IsDownloading.ordinal()) =
                2
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.p041ui.download.iArr
        }
    }

    @Override // com.lagradost.cloudstream3.utils.IDisposable
    public override fun dispose() {
        try {
            val function1: Function1<Triple<Integer?, Long?, Long?>?, Unit>? =
                downloadProgressEventListener
            if (function1 != null) {
                VideoDownloadManager.INSTANCE.downloadProgressEvent.minusAssign(function1)
            }
            val function12: Function1<Tuples<Integer?, out DownloadType>?, Unit>? =
                downloadStatusEventListener
            if (function12 != null) {
                VideoDownloadManager.INSTANCE.downloadStatusEvent.minusAssign(function12)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun setUpMaterialButton(
        l: Long?,
        l2: Long?,
        progressBar: ContentLoadingProgressBar?,
        downloadButton: MaterialButton,
        textView: TextView?,
        data: IMinimumData?,
        clickCallback: Function1<DownloadClickEvent?, Unit>
    ) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar")
        Intrinsics.checkNotNullParameter(downloadButton, "downloadButton")
        Intrinsics.checkNotNullParameter(data, "data")
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
        `setUpDownloadButton$default`(
            this,
            l,
            l2,
            progressBar,
            textView,
            data,
            downloadButton,
            `EasyDownloadButton$setUpMaterialButton$1`(downloadButton),
            clickCallback,
            false,
            256,
            null
        )
    }

    fun setUpMoreButton(
        l: Long?,
        l2: Long?,
        progressBar: ContentLoadingProgressBar?,
        downloadImage: ImageView,
        textView: TextView?,
        textView2: TextView?,
        clickableView: View,
        z: Boolean,
        data: IMinimumData?,
        clickCallback: Function1<DownloadClickEvent?, Unit>
    ) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar")
        Intrinsics.checkNotNullParameter(downloadImage, "downloadImage")
        Intrinsics.checkNotNullParameter(clickableView, "clickableView")
        Intrinsics.checkNotNullParameter(data, "data")
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
        setUpDownloadButton(
            l,
            l2,
            progressBar,
            textView2,
            data,
            clickableView,
            `EasyDownloadButton$setUpMoreButton$1`(downloadImage, textView2, textView),
            clickCallback,
            z
        )
    }

    fun setUpButton(
        l: Long?,
        l2: Long?,
        progressBar: ContentLoadingProgressBar?,
        downloadImage: ImageView,
        textView: TextView?,
        data: IMinimumData?,
        clickCallback: Function1<DownloadClickEvent, Unit>
    ) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar")
        Intrinsics.checkNotNullParameter(downloadImage, "downloadImage")
        Intrinsics.checkNotNullParameter(data, "data")
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
        `setUpDownloadButton$default`(
            this,
            l,
            l2,
            progressBar,
            textView,
            data,
            downloadImage,
            `EasyDownloadButton$setUpButton$1`(downloadImage),
            clickCallback,
            false,
            256,
            null
        )
    }

    private fun setUpDownloadButton(
        l: Long?,
        l2: Long?,
        contentLoadingProgressBar: ContentLoadingProgressBar?,
        textView: TextView?,
        iMinimumData: IMinimumData?,
        view: View,
        function1: Function1<Tuples<Integer?, String?>?, Unit>,
        function12: Function1<DownloadClickEvent, Unit>,
        z: Boolean
    ) {
        val objectRef: ObjectRef<*> = ObjectRef<Any?>()
        val longRef: LongRef = LongRef()
        longRef.element = if (l != null) l.longValue() else 0L
        val longRef2: LongRef = LongRef()
        longRef2.element = if (l2 != null) l2.longValue() else 0L
        val booleanRef: BooleanRef = BooleanRef()
        booleanRef.element = true
        `setUpDownloadButton$fixDownloadedBytes`(
            longRef,
            longRef2,
            textView,
            contentLoadingProgressBar,
            objectRef,
            iMinimumData,
            z,
            booleanRef,
            function1,
            view,
            longRef.element,
            longRef2.element,
            false
        )
        `setUpDownloadButton$changeDownloadImage`(
            objectRef,
            longRef,
            booleanRef,
            function1,
            view,
            VideoDownloadManager.INSTANCE.getDownloadState(
                iMinimumData!!.id
            )
        )
        downloadProgressEventListener = `EasyDownloadButton$setUpDownloadButton$1`(
            iMinimumData,
            longRef,
            longRef2,
            textView,
            contentLoadingProgressBar,
            objectRef,
            z,
            booleanRef,
            function1,
            view
        )
        downloadStatusEventListener = `EasyDownloadButton$setUpDownloadButton$2`(
            iMinimumData,
            objectRef,
            booleanRef,
            longRef,
            function1,
            view
        )
        val function13: Function1<Triple<Integer?, Long?, Long?>?, Unit>? =
            downloadProgressEventListener
        if (function13 != null) {
            VideoDownloadManager.INSTANCE.downloadProgressEvent.plusAssign(function13)
        }
        val function14: Function1<Tuples<Integer?, out DownloadType>?, Unit>? =
            downloadStatusEventListener
        if (function14 != null) {
            VideoDownloadManager.INSTANCE.downloadStatusEvent.plusAssign(function14)
        }
        view.setOnClickListener(object : OnClickListener() {
            // from class: com.lagradost.cloudstream3.ui.download.-$$Lambda$EasyDownloadButton$kAjeoHdwtOczFLX6ZmKGYq1kvM4
            @Override // android.view.View.OnClickListener
            fun onClick(view2: View?) {
                `m8628setUpDownloadButton$lambda5`(
                    this@LongRef,
                    function12,
                    iMinimumData,
                    longRef2,
                    objectRef,
                    view2
                )
            }
        })
        view.setOnLongClickListener(object : OnLongClickListener() {
            // from class: com.lagradost.cloudstream3.ui.download.-$$Lambda$EasyDownloadButton$MhVdXPS05AYQBBbLiWS_pz4raR0
            @Override // android.view.View.OnLongClickListener
            fun onLongClick(view2: View?): Boolean {
                val `m8629setUpDownloadButton$lambda6`: Boolean
                `m8629setUpDownloadButton$lambda6` =
                    `m8629setUpDownloadButton$lambda6`(this@Function1, iMinimumData, view2)
                return `m8629setUpDownloadButton$lambda6`
            }
        })
    }

    companion object {
        fun  /* synthetic */`setUpDownloadButton$default`(
            easyDownloadButton: EasyDownloadButton,
            l: Long?,
            l2: Long?,
            contentLoadingProgressBar: ContentLoadingProgressBar?,
            textView: TextView?,
            iMinimumData: IMinimumData?,
            view: View,
            function1: Function1<*, *>,
            function12: Function1<*, *>,
            z: Boolean,
            i: Int,
            obj: Object?
        ) {
            easyDownloadButton.setUpDownloadButton(
                l,
                l2,
                contentLoadingProgressBar,
                textView,
                iMinimumData,
                view,
                function1,
                function12,
                if ((i and 256) != 0) false else z
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Multi-variable type inference failed */
        fun `setUpDownloadButton$changeDownloadImage`(
            objectRef: ObjectRef<DownloadType?>,
            longRef: LongRef,
            booleanRef: BooleanRef,
            function1: Function1<Tuples<Integer?, String?>?, Unit>,
            view: View,
            downloadType: DownloadType
        ) {
            val tuples: Tuples<*, *>
            objectRef.element = downloadType
            if (longRef.element <= 0) {
                booleanRef.element = true
            }
            if (longRef.element > 0) {
                val i: Int = WhenMappings.`$EnumSwitchMapping$0`.get(downloadType.ordinal())
                if (i == 1) {
                    tuples = Tuples<Any?, Any?>(
                        Integer.valueOf(R.drawable.ic_baseline_play_arrow_24 as Int),
                        Integer.valueOf(R.string.download_paused as Int)
                    )
                } else if (i == 2) {
                    tuples = Tuples<Any?, Any?>(
                        Integer.valueOf(R.drawable.netflix_pause as Int),
                        Integer.valueOf(R.string.downloading as Int)
                    )
                } else {
                    tuples = Tuples<Any?, Any?>(
                        Integer.valueOf(R.drawable.ic_baseline_delete_outline_24 as Int),
                        Integer.valueOf(R.string.downloaded as Int)
                    )
                }
            } else {
                tuples = Tuples<Any?, Any?>(
                    Integer.valueOf(R.drawable.netflix_download as Int),
                    Integer.valueOf(R.string.download as Int)
                )
            }
            function1.invoke(
                Tuples<Any?, Any?>(
                    tuples.getFirst(),
                    view.getContext().getString((tuples.getSecond() as Number).intValue())
                )
            )
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun `setUpDownloadButton$fixDownloadedBytes`(
            longRef: LongRef,
            longRef2: LongRef,
            textView: TextView?,
            contentLoadingProgressBar: ContentLoadingProgressBar,
            objectRef: ObjectRef<DownloadType?>,
            iMinimumData: IMinimumData?,
            z: Boolean,
            booleanRef: BooleanRef?,
            function1: Function1<Tuples<Integer?, String?>?, Unit>,
            view: View?,
            j: Long,
            j2: Long,
            z2: Boolean
        ) {
            val str: String?
            val str2: String?
            var string: String?
            longRef.element = j
            longRef2.element = j2
            if (longRef.element == 0L) {
                `setUpDownloadButton$changeDownloadImage`(
                    objectRef,
                    longRef,
                    booleanRef,
                    function1,
                    view,
                    VideoDownloadManager.DownloadType.IsStopped
                )
                if (textView != null) {
                    textView.setVisibility(8)
                }
                contentLoadingProgressBar.setVisibility(8)
                return
            }
            if (objectRef.element === VideoDownloadManager.DownloadType.IsStopped) {
                `setUpDownloadButton$changeDownloadImage`(
                    objectRef,
                    longRef,
                    booleanRef,
                    function1,
                    view,
                    VideoDownloadManager.INSTANCE.getDownloadState(
                        iMinimumData!!.id
                    )
                )
            }
            if (textView != null) {
                textView.setVisibility(0)
            }
            contentLoadingProgressBar.setVisibility(0)
            val format: String = String.format(
                "%.1f",
                Arrays.copyOf(arrayOf<Object>(Float.valueOf((j.toFloat()) / 1000000.0f)), 1)
            )
            Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
            val format2: String = String.format(
                "%.1f",
                Arrays.copyOf(arrayOf<Object>(Float.valueOf((j2.toFloat()) / 1000000.0f)), 1)
            )
            Intrinsics.checkNotNullExpressionValue(format2, "format(this, *args)")
            if (textView != null) {
                if (z) {
                    val format3: String = String.format(
                        "%d%%",
                        Arrays.copyOf(arrayOf<Object>(Long.valueOf((100 * j) / j2)), 1)
                    )
                    Intrinsics.checkNotNullExpressionValue(format3, "format(this, *args)")
                    str2 = format3
                } else {
                    val context: Context? = textView.getContext()
                    if (context == null || (context.getString(R.string.download_size_format)
                            .also({ string = it })) == null
                    ) {
                        str = null
                    } else {
                        str = String.format(string, Arrays.copyOf(arrayOf(format, format2), 2))
                        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)")
                    }
                    str2 = str
                }
                textView.setText(str2)
            }
            val j3: Long = 1000
            contentLoadingProgressBar.setMax((j2 / j3).toInt())
            if (z2) {
                val ofInt: ObjectAnimator = ObjectAnimator.ofInt(
                    contentLoadingProgressBar,
                    "progress",
                    contentLoadingProgressBar.getProgress(),
                    (j / j3).toInt()
                )
                Intrinsics.checkNotNullExpressionValue(
                    ofInt,
                    "ofInt(\n                 …                        )"
                )
                ofInt.setDuration(500L)
                ofInt.setAutoCancel(true)
                ofInt.setInterpolator(DecelerateInterpolator())
                ofInt.start()
                return
            }
            contentLoadingProgressBar.setProgress((j / j3).toInt())
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpDownloadButton$lambda-5  reason: not valid java name */
        fun `m8628setUpDownloadButton$lambda5`(
            currentBytes: LongRef,
            clickCallback: Function1<*, *>,
            data: IMinimumData?,
            totalBytes: LongRef,
            lastState: ObjectRef<*>,
            it: View?
        ) {
            val tuples: Tuples<*, *>
            Intrinsics.checkNotNullParameter(currentBytes, "\$currentBytes")
            Intrinsics.checkNotNullParameter(clickCallback, "\$clickCallback")
            Intrinsics.checkNotNullParameter(data, "\$data")
            Intrinsics.checkNotNullParameter(totalBytes, "\$totalBytes")
            Intrinsics.checkNotNullParameter(lastState, "\$lastState")
            if (currentBytes.element <= 0) {
                clickCallback.invoke(DownloadClickEvent(4, data))
                return
            }
            val arrayListOf: ArrayList = CollectionsKt.arrayListOf<Tuples<*, *>>(
                Tuples<Any?, Any?>(
                    0,
                    Integer.valueOf(R.string.popup_play_file as Int)
                ), Tuples<Any?, Any?>(1, Integer.valueOf(R.string.popup_delete_file as Int))
            )
            if ((currentBytes.element * 100) / totalBytes.element < 98) {
                if (lastState.element === VideoDownloadManager.DownloadType.IsDownloading) {
                    tuples =
                        Tuples<Any?, Any?>(3, Integer.valueOf(R.string.popup_pause_download as Int))
                } else {
                    tuples = Tuples<Any?, Any?>(
                        2,
                        Integer.valueOf(R.string.popup_resume_download as Int)
                    )
                }
                arrayListOf.add(tuples)
            }
            val uIHelper: UIHelper = UIHelper.INSTANCE
            Intrinsics.checkNotNullExpressionValue(it, "it")
            uIHelper.popupMenuNoIcons(
                it,
                arrayListOf,
                `EasyDownloadButton$setUpDownloadButton$5$1`(clickCallback, data)
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpDownloadButton$lambda-6  reason: not valid java name */
        fun `m8629setUpDownloadButton$lambda6`(
            clickCallback: Function1<*, *>,
            data: IMinimumData?,
            view: View?
        ): Boolean {
            Intrinsics.checkNotNullParameter(clickCallback, "\$clickCallback")
            Intrinsics.checkNotNullParameter(data, "\$data")
            clickCallback.invoke(DownloadClickEvent(5, data))
            return true
        }
    }
}