package com.lagradost.cloudstream3.p041ui.player

import android.os.Handler
import androidx.core.app.NotificationCompat
import com.google.android.exoplayer2.Format
import com.google.android.exoplayer2.util.Log
import com.google.android.exoplayer2.util.Util
import kotlin.jvm.internal.Intrinsics

/* compiled from: NonFinalTextRenderer.kt */
@Metadata(
    m108d1 = ["\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000e\b\u0016\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0002HIB%\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020&H\u0002J\u0016\u00100\u001a\u00020&2\u000c\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0002J\b\u00104\u001a\u00020\u0015H\u0016J\b\u00105\u001a\u00020\u0015H\u0016J\b\u00106\u001a\u00020&H\u0014J\u0018\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u0015H\u0014J+\u0010:\u001a\u00020&2\u000c\u0010;\u001a\b\u0012\u0004\u0012\u00020\"0<2\u0006\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u0011H\u0014¢\u0006\u0002\u0010?J\b\u0010@\u001a\u00020&H\u0002J\b\u0010A\u001a\u00020&H\u0002J\u0018\u0010B\u001a\u00020&2\u0006\u00108\u001a\u00020\u00112\u0006\u0010C\u001a\u00020\u0011H\u0016J\b\u0010D\u001a\u00020&H\u0002J\u0010\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u00020\"H\u0016J\u0016\u0010G\u001a\u00020&2\u000c\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u00020\rX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/NonFinalTextRenderer;", "Lcom/google/android/exoplayer2/BaseRenderer;", "Landroid/os/Handler\$Callback;", AgentOptions.OUTPUT, "Lcom/google/android/exoplayer2/text/TextOutput;", "outputLooper", "Landroid/os/Looper;", "decoderFactory", "Lcom/google/android/exoplayer2/text/SubtitleDecoderFactory;", "(Lcom/google/android/exoplayer2/text/TextOutput;Landroid/os/Looper;Lcom/google/android/exoplayer2/text/SubtitleDecoderFactory;)V", "decoder", "Lcom/google/android/exoplayer2/text/SubtitleDecoder;", "decoderReplacementState", "", "getDecoderReplacementState\$annotations", "()V", "finalStreamEndPositionUs", "", "formatHold", "Lcom/google/android/exoplayer2/FormatHolder;", "inputStreamEnded", "", "nextEventTime", "getNextEventTime", "()J", "nextInputBuffer", "Lcom/google/android/exoplayer2/text/SubtitleInputBuffer;", "nextSubtitle", "Lcom/google/android/exoplayer2/text/SubtitleOutputBuffer;", "nextSubtitleEventIndex", "outputHandler", "Landroid/os/Handler;", "outputStreamEnded", "streamFormat", "Lcom/google/android/exoplayer2/Format;", "subtitle", "waitingForKeyFrame", "clearOutput", "", "getName", "", "handleDecoderError", "e", "Lcom/google/android/exoplayer2/text/SubtitleDecoderException;", "handleMessage", NotificationCompat.CATEGORY_MESSAGE, "Landroid/os/Message;", "initDecoder", "invokeUpdateOutputInternal", "cues", "", "Lcom/google/android/exoplayer2/text/Cue;", "isEnded", "isReady", "onDisabled", "onPositionReset", "positionUs", "joining", "onStreamChanged", "formats", "", "startPositionUs", "offsetUs", "([Lcom/google/android/exoplayer2/Format;JJ)V", "releaseBuffers", "releaseDecoder", "render", "elapsedRealtimeUs", "replaceDecoder", "supportsFormat", "format", "updateOutput", "Companion", "ReplacementState", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.player.NonFinalTextRenderer */ /* loaded from: classes3.dex */
open class NonFinalTextRenderer : BaseRenderer, Handler.Callback {
    private var decoder: SubtitleDecoder? = null
    private val decoderFactory: SubtitleDecoderFactory
    private var decoderReplacementState: Int = 0
    private var finalStreamEndPositionUs: Long = 0
    private val formatHold: FormatHolder
    private var inputStreamEnded: Boolean = false
    private var nextInputBuffer: SubtitleInputBuffer? = null
    private var nextSubtitle: SubtitleOutputBuffer? = null
    private var nextSubtitleEventIndex: Int = 0
    private val output: TextOutput
    private val outputHandler: Handler?

    // com.google.android.exoplayer2.Renderer
    @get:Override
    var isEnded: Boolean = false
        private set
    private var streamFormat: Format? = null
    private var subtitle: SubtitleOutputBuffer? = null
    private var waitingForKeyFrame: Boolean = false

    /* compiled from: NonFinalTextRenderer.kt */
    @MustBeDocumented
    @Metadata(
        m108d1 = ["\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0083\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/NonFinalTextRenderer\$ReplacementState;", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Retention(AnnotationRetention.SOURCE)
    /* renamed from: com.lagradost.cloudstream3.ui.player.NonFinalTextRenderer$ReplacementState */ /* loaded from: classes3.dex */
    private annotation class ReplacementState constructor() {}

    constructor(textOutput: TextOutput?, looper: Looper?) : this(
        textOutput,
        looper,
        null,
        4,
        null
    ) {
    }

    // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    @get:Override
    val name: String
        // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
        get() {
            return NonFinalTextRenderer.Companion.TAG
        }

    // com.google.android.exoplayer2.Renderer
    @get:Override
    val isReady: Boolean
        // com.google.android.exoplayer2.Renderer
        get() {
            return true
        }

    /* JADX WARN: Illegal instructions before constructor call */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    /* synthetic */   constructor(
        r1: TextOutput?,
        r2: android.os.Looper?,
        r3: SubtitleDecoderFactory?,
        r4: Int,
        r5: DefaultConstructorMarker?
    ) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            com.google.android.exoplayer2.text.SubtitleDecoderFactory r3 = com.google.android.exoplayer2.text.SubtitleDecoderFactory.DEFAULT
            java.lang.String r4 = "DEFAULT"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
        Lb:
            r0.<init>(r1, r2, r3)
            return
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.player.NonFinalTextRenderer.<init>(com.google.android.exoplayer2.text.TextOutput, android.os.Looper, com.google.android.exoplayer2.text.SubtitleDecoderFactory, int, kotlin.jvm.internal.DefaultConstructorMarker):void")
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    constructor(
        textOutput: TextOutput?,
        looper: Looper?,
        decoderFactory: SubtitleDecoderFactory
    ) : super(3) {
        Intrinsics.checkNotNullParameter(decoderFactory, "decoderFactory")
        this.decoderFactory = decoderFactory
        outputHandler = if (looper == null) null else Util.createHandler(looper, this)
        val checkNotNull: Object = Assertions.checkNotNull<TextOutput>(textOutput)
        Intrinsics.checkNotNullExpressionValue(checkNotNull, "checkNotNull(output)")
        output = checkNotNull as TextOutput
        formatHold = FormatHolder()
        finalStreamEndPositionUs = C3282C.TIME_UNSET
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public override fun supportsFormat(format: Format): Int {
        Intrinsics.checkNotNullParameter(format, "format")
        if (decoderFactory.supportsFormat(format)) {
            return RendererCapabilities.CC.create(if (format.cryptoType == 0) 4 else 2)
        } else if (MimeTypes.isText(format.sampleMimeType)) {
            return RendererCapabilities.CC.create(1)
        } else {
            return RendererCapabilities.CC.create(0)
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.BaseRenderer
    public override fun onStreamChanged(formats: Array<Format>, j: Long, j2: Long) {
        Intrinsics.checkNotNullParameter(formats, "formats")
        streamFormat = formats.get(0)
        if (decoder != null) {
            decoderReplacementState = 1
        } else {
            initDecoder()
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected override fun onPositionReset(j: Long, z: Boolean) {
        clearOutput()
        inputStreamEnded = false
        isEnded = false
        finalStreamEndPositionUs = C3282C.TIME_UNSET
        if (decoderReplacementState != 0) {
            replaceDecoder()
            return
        }
        releaseBuffers()
        (Assertions.checkNotNull<SubtitleDecoder>(decoder) as SubtitleDecoder).flush()
    }

    @Override // com.google.android.exoplayer2.Renderer
    public override fun render(j: Long, j2: Long) {
        var z: Boolean
        if (isCurrentStreamFinal()) {
            val j3: Long = finalStreamEndPositionUs
            if (j3 != C3282C.TIME_UNSET && j >= j3) {
                releaseBuffers()
                isEnded = true
            }
        }
        if (isEnded) {
            return
        }
        if (nextSubtitle == null) {
            (Assertions.checkNotNull<SubtitleDecoder>(decoder) as SubtitleDecoder).setPositionUs(j)
            try {
                nextSubtitle =
                    (Assertions.checkNotNull<SubtitleDecoder>(decoder) as SubtitleDecoder).dequeueOutputBuffer()
            } catch (e: SubtitleDecoderException) {
                handleDecoderError(e)
                return
            }
        }
        if (getState() != 2) {
            return
        }
        if (subtitle != null) {
            var nextEventTime: Long = nextEventTime
            z = false
            while (nextEventTime <= j) {
                nextSubtitleEventIndex++
                nextEventTime = nextEventTime
                z = true
            }
        } else {
            z = false
        }
        val subtitleOutputBuffer: SubtitleOutputBuffer? = nextSubtitle
        if (subtitleOutputBuffer != null) {
            Intrinsics.checkNotNull(subtitleOutputBuffer)
            if (subtitleOutputBuffer.isEndOfStream()) {
                if (!z && nextEventTime == Long.MAX_VALUE) {
                    if (decoderReplacementState == 2) {
                        replaceDecoder()
                    } else {
                        releaseBuffers()
                        isEnded = true
                    }
                }
            } else if (subtitleOutputBuffer.timeUs <= j) {
                val subtitleOutputBuffer2: SubtitleOutputBuffer? = subtitle
                if (subtitleOutputBuffer2 != null) {
                    Intrinsics.checkNotNull(subtitleOutputBuffer2)
                    subtitleOutputBuffer2.release()
                }
                nextSubtitleEventIndex = subtitleOutputBuffer.getNextEventTimeIndex(j)
                subtitle = subtitleOutputBuffer
                nextSubtitle = null
                z = true
            }
        }
        if (z) {
            Assertions.checkNotNull<SubtitleOutputBuffer>(subtitle)
            val subtitleOutputBuffer3: SubtitleOutputBuffer? = subtitle
            Intrinsics.checkNotNull(subtitleOutputBuffer3)
            val cues: List<Cue> = subtitleOutputBuffer3.getCues(j)
            Intrinsics.checkNotNullExpressionValue(cues, "subtitle!!.getCues(positionUs)")
            updateOutput(cues)
        }
        if (decoderReplacementState == 2) {
            return
        }
        while (!inputStreamEnded) {
            try {
                var subtitleInputBuffer: SubtitleInputBuffer? = nextInputBuffer
                if (subtitleInputBuffer == null) {
                    subtitleInputBuffer =
                        (Assertions.checkNotNull<SubtitleDecoder>(decoder) as SubtitleDecoder).dequeueInputBuffer()
                    if (subtitleInputBuffer == null) {
                        return
                    }
                    nextInputBuffer = subtitleInputBuffer
                }
                if (decoderReplacementState == 1) {
                    subtitleInputBuffer.setFlags(4)
                    (Assertions.checkNotNull<SubtitleDecoder>(decoder) as SubtitleDecoder).queueInputBuffer(
                        subtitleInputBuffer
                    )
                    nextInputBuffer = null
                    decoderReplacementState = 2
                    return
                }
                val readSource: Int = readSource(formatHold, subtitleInputBuffer, 0)
                if (readSource == -4) {
                    if (subtitleInputBuffer.isEndOfStream()) {
                        inputStreamEnded = true
                        waitingForKeyFrame = false
                    } else {
                        val format: Format? = formatHold.format
                        if (format == null) {
                            return
                        }
                        subtitleInputBuffer.subsampleOffsetUs = format.subsampleOffsetUs
                        subtitleInputBuffer.flip()
                        waitingForKeyFrame =
                            waitingForKeyFrame and !subtitleInputBuffer.isKeyFrame()
                    }
                    if (!waitingForKeyFrame) {
                        (Assertions.checkNotNull<SubtitleDecoder>(decoder) as SubtitleDecoder).queueInputBuffer(
                            subtitleInputBuffer
                        )
                        nextInputBuffer = null
                    }
                } else if (readSource == -3) {
                    return
                }
            } catch (e2: SubtitleDecoderException) {
                handleDecoderError(e2)
                return
            }
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected override fun onDisabled() {
        streamFormat = null
        finalStreamEndPositionUs = C3282C.TIME_UNSET
        clearOutput()
        releaseDecoder()
    }

    private fun releaseBuffers() {
        nextInputBuffer = null
        nextSubtitleEventIndex = -1
        val subtitleOutputBuffer: SubtitleOutputBuffer? = subtitle
        if (subtitleOutputBuffer != null) {
            Intrinsics.checkNotNull(subtitleOutputBuffer)
            subtitleOutputBuffer.release()
            subtitle = null
        }
        val subtitleOutputBuffer2: SubtitleOutputBuffer? = nextSubtitle
        if (subtitleOutputBuffer2 != null) {
            Intrinsics.checkNotNull(subtitleOutputBuffer2)
            subtitleOutputBuffer2.release()
            nextSubtitle = null
        }
    }

    private fun releaseDecoder() {
        releaseBuffers()
        (Assertions.checkNotNull<SubtitleDecoder>(decoder) as SubtitleDecoder).release()
        decoder = null
        decoderReplacementState = 0
    }

    private fun initDecoder() {
        waitingForKeyFrame = true
        decoder = decoderFactory.createDecoder(
            Assertions.checkNotNull<Format>(
                streamFormat
            ) as Format?
        )
    }

    private fun replaceDecoder() {
        releaseDecoder()
        initDecoder()
    }

    private val nextEventTime: Long
        private get() {
            if (nextSubtitleEventIndex == -1) {
                return Long.MAX_VALUE
            }
            Assertions.checkNotNull<SubtitleOutputBuffer>(subtitle)
            val i: Int = nextSubtitleEventIndex
            val subtitleOutputBuffer: SubtitleOutputBuffer? = subtitle
            Intrinsics.checkNotNull(subtitleOutputBuffer)
            if (i >= subtitleOutputBuffer.getEventTimeCount()) {
                return Long.MAX_VALUE
            }
            val subtitleOutputBuffer2: SubtitleOutputBuffer? = subtitle
            Intrinsics.checkNotNull(subtitleOutputBuffer2)
            return subtitleOutputBuffer2.getEventTime(nextSubtitleEventIndex)
        }

    private fun updateOutput(list: List<Cue>) {
        val handler: Handler? = outputHandler
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget()
        } else {
            invokeUpdateOutputInternal(list)
        }
    }

    private fun clearOutput() {
        updateOutput(CollectionsKt.emptyList<Any>())
    }

    @Override // android.os.Handler.Callback
    fun handleMessage(msg: Message): Boolean {
        Intrinsics.checkNotNullParameter(msg, "msg")
        if (msg.what === 0) {
            val obj: Object = msg.obj
            Objects.requireNonNull(
                obj,
                "null cannot be cast to non-null type kotlin.collections.List<com.google.android.exoplayer2.text.Cue>"
            )
            invokeUpdateOutputInternal(obj as List)
            return true
        }
        throw IllegalStateException()
    }

    private fun invokeUpdateOutputInternal(list: List<Cue>) {
        val textOutput: TextOutput = output
        val list2: List<Cue> = list
        val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
        for (cue: Cue in list2) {
            arrayList.add(cue.buildUpon().setSize(-3.4028235E38f).build())
        }
        textOutput.onCues(arrayList)
    }

    private fun handleDecoderError(subtitleDecoderException: SubtitleDecoderException) {
        Log.m382e(
            NonFinalTextRenderer.Companion.TAG,
            "Subtitle decoding failed. streamFormat=" + streamFormat,
            subtitleDecoderException
        )
        clearOutput()
        replaceDecoder()
    }

    /* compiled from: NonFinalTextRenderer.kt */
    @Metadata(
        m108d1 = ["\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/NonFinalTextRenderer\$Companion;", "", "()V", "MSG_UPDATE_OUTPUT", "", "REPLACEMENT_STATE_NONE", "REPLACEMENT_STATE_SIGNAL_END_OF_STREAM", "REPLACEMENT_STATE_WAIT_END_OF_STREAM", "TAG", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.player.NonFinalTextRenderer$Companion */ /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}
    }

    companion object {
        val Companion: Companion = Companion(null)
        private val MSG_UPDATE_OUTPUT: Int = 0
        private val REPLACEMENT_STATE_NONE: Int = 0
        private val REPLACEMENT_STATE_SIGNAL_END_OF_STREAM: Int = 1
        private val REPLACEMENT_STATE_WAIT_END_OF_STREAM: Int = 2
        private val TAG: String = "TextRenderer"

        /* synthetic */
        private val `decoderReplacementState$annotations`: Unit
            private get() {}
    }
}