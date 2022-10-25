package com.lagradost.cloudstream3.p041ui.player

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* compiled from: PlayerSubtitleHelper.kt */
@Metadata(
    m108d1 = ["\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u000c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J$\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\bJ\u0014\u0010\u0012\u001a\u00020\r2\u000c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\u0014\u001a\u00020\r2\u000c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\bJ\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/PlayerSubtitleHelper;", "", "()V", "activeSubtitles", "", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "allSubtitles", "subStyle", "Lcom/lagradost/cloudstream3/ui/subtitles/SaveCaptionStyle;", "subtitleView", "Lcom/google/android/exoplayer2/ui/SubtitleView;", "getAllSubtitles", "initSubtitles", "", "subView", "subHolder", "Landroid/widget/FrameLayout;", "style", "setActiveSubtitles", "list", "setAllSubtitles", "setSubStyle", "subtitleStatus", "Lcom/lagradost/cloudstream3/ui/player/SubtitleStatus;", "sub", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.PlayerSubtitleHelper */ /* loaded from: classes3.dex */
class PlayerSubtitleHelper constructor() {
    private var activeSubtitles: Set<SubtitleData> = SetsKt.emptySet<Any>()
    private var allSubtitles: Set<SubtitleData?> = SetsKt.emptySet<Any>()
    private var subStyle: SaveCaptionStyle? = null
    private var subtitleView: SubtitleView? = null
    fun getAllSubtitles(): Set<SubtitleData?> {
        return allSubtitles
    }

    fun setActiveSubtitles(list: Set<SubtitleData>) {
        Intrinsics.checkNotNullParameter(list, "list")
        activeSubtitles = list
    }

    fun setAllSubtitles(list: Set<SubtitleData?>) {
        Intrinsics.checkNotNullParameter(list, "list")
        allSubtitles = list
    }

    /* compiled from: PlayerSubtitleHelper.kt */
    @Metadata(
        m108d1 = ["\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\n\u0010\u0007\u001a\u00020\b*\u00020\b¨\u0006\t"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/PlayerSubtitleHelper\$Companion;", "", "()V", "getSubtitleData", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "subtitleFile", "Lcom/lagradost/cloudstream3/SubtitleFile;", "toSubtitleMimeType", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.player.PlayerSubtitleHelper$Companion */ /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        fun toSubtitleMimeType(str: String?): String {
            Intrinsics.checkNotNullParameter(str, "<this>")
            return if (StringsKt.endsWith(
                    str,
                    "vtt",
                    true
                )
            ) MimeTypes.TEXT_VTT else if (StringsKt.endsWith(
                    str,
                    "srt",
                    true
                )
            ) MimeTypes.APPLICATION_SUBRIP else if ((StringsKt.endsWith(
                    str,
                    "xml",
                    true
                ) || StringsKt.endsWith(str, "ttml", true))
            ) MimeTypes.APPLICATION_TTML else MimeTypes.APPLICATION_SUBRIP
        }

        fun getSubtitleData(subtitleFile: SubtitleFile): SubtitleData {
            Intrinsics.checkNotNullParameter(subtitleFile, "subtitleFile")
            return SubtitleData(
                subtitleFile.lang,
                subtitleFile.url,
                SubtitleOrigin.URL,
                toSubtitleMimeType(subtitleFile.url),
                subtitleFile.isZipUrl
            )
        }
    }

    fun subtitleStatus(subtitleData: SubtitleData?): SubtitleStatus {
        if (CollectionsKt.contains(activeSubtitles, subtitleData)) {
            return SubtitleStatus.IS_ACTIVE
        }
        if (CollectionsKt.contains(allSubtitles, subtitleData)) {
            return SubtitleStatus.REQUIRES_RELOAD
        }
        return SubtitleStatus.NOT_FOUND
    }

    fun setSubStyle(style: SaveCaptionStyle) {
        var context: Context?
        Intrinsics.checkNotNullParameter(style, "style")
        CustomDecoder.Companion.Companion.setRegexSubtitlesToRemoveBloat(style.getRemoveBloat())
        CustomDecoder.Companion.Companion.setRegexSubtitlesToRemoveCaptions(style.getRemoveCaptions())
        val subtitleView: SubtitleView? = subtitleView
        if (subtitleView == null || (subtitleView.getContext().also({ context = it })) == null) {
            return
        }
        subStyle = style
        val subtitleView2: SubtitleView? = this.subtitleView
        if (subtitleView2 != null) {
            subtitleView2.setStyle(
                SubtitlesFragment.Companion.Companion.fromSaveToStyle(
                    context,
                    style
                )
            )
        }
        val subtitleView3: SubtitleView? = this.subtitleView
        if (subtitleView3 != null) {
            subtitleView3.setTranslationY(-UIHelper.INSTANCE.getToPx(style.getElevation()))
        }
        val fixedTextSize: Float? = style.getFixedTextSize()
        if (fixedTextSize != null) {
            val subtitleView4: SubtitleView? = this.subtitleView
            if (subtitleView4 != null) {
                subtitleView4.setFixedTextSize(2, fixedTextSize.floatValue())
                return
            }
            return
        }
        val subtitleView5: SubtitleView? = this.subtitleView
        if (subtitleView5 != null) {
            subtitleView5.setUserDefaultTextSize()
        }
    }

    fun initSubtitles(
        subtitleView: SubtitleView?,
        frameLayout: FrameLayout?,
        saveCaptionStyle: SaveCaptionStyle?
    ) {
        this.subtitleView = subtitleView
        if (subtitleView != null) {
            val viewGroup: ViewGroup? = subtitleView.getParent() as ViewGroup?
            if (viewGroup != null) {
                viewGroup.removeView(subtitleView)
            }
            if (frameLayout != null) {
                frameLayout.addView(subtitleView)
            }
        }
        if (saveCaptionStyle != null) {
            setSubStyle(saveCaptionStyle)
        }
    }

    companion object {
        val Companion: Companion = Companion(null)
    }
}