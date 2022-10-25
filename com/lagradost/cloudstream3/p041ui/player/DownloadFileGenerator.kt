package com.lagradost.cloudstream3.p041ui.player

import android.content.Context
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: DownloadFileGenerator.kt */
@Metadata(
    m108d1 = ["\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007Ja\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\"\u0010\u0015\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0017\u0012\u0004\u0012\u00020\u00190\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00190\u00162\u0006\u0010\u001c\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\u000f\u0010 \u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020\tH\u0016J\b\u0010&\u001a\u00020\u0019H\u0016J\b\u0010'\u001a\u00020\u0019H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/DownloadFileGenerator;", "Lcom/lagradost/cloudstream3/ui/player/IGenerator;", "episodes", "", "Lcom/lagradost/cloudstream3/utils/ExtractorUri;", "currentIndex", "", "(Ljava/util/List;I)V", "hasCache", "", "getHasCache", "()Z", "loadResponse", "Lcom/lagradost/cloudstream3/LoadResponse;", "getLoadResponse", "()Lcom/lagradost/cloudstream3/LoadResponse;", "setLoadResponse", "(Lcom/lagradost/cloudstream3/LoadResponse;)V", "generateLinks", "clearCache", "isCasting", "callback", "Lkotlin/Function1;", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "", "subtitleCallback", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", TypedValues.CycleType.S_WAVE_OFFSET, "(ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrent", "", "getCurrentId", "()Ljava/lang/Integer;", "goto", FirebaseAnalytics.Param.INDEX, "hasNext", "hasPrev", "next", "prev", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.DownloadFileGenerator */ /* loaded from: classes3.dex */
class DownloadFileGenerator constructor(episodes: List<ExtractorUri>, i: Int) : IGenerator {
    private var currentIndex: Int
    private val episodes: List<ExtractorUri>

    // com.lagradost.cloudstream3.p041ui.player.IGenerator
    @get:Override
    override val hasCache: Boolean = false
    private var loadResponse: LoadResponse? = null

    init {
        Intrinsics.checkNotNullParameter(episodes, "episodes")
        this.episodes = episodes
        currentIndex = i
    }

    /* synthetic */   constructor(
        list: List,
        i: Int,
        i2: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(list, if ((i2 and 2) != 0) 0 else i) {
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    public override fun getLoadResponse(): LoadResponse? {
        return loadResponse
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    public override fun setLoadResponse(loadResponse: LoadResponse?) {
        this.loadResponse = loadResponse
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    public override fun hasNext(): Boolean {
        return currentIndex < episodes.size() - 1
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    public override fun hasPrev(): Boolean {
        return currentIndex > 0
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    public override fun next() {
        if (hasNext()) {
            currentIndex++
        }
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    public override fun prev() {
        if (hasPrev()) {
            currentIndex--
        }
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    /* renamed from: goto  reason: not valid java name */ public override fun mo8669goto(i: Int) {
        currentIndex = Math.min(episodes.size() - 1, Math.max(0, i))
    }

    // com.lagradost.cloudstream3.p041ui.player.IGenerator
    @get:Override
    override val currentId: Integer
        // com.lagradost.cloudstream3.p041ui.player.IGenerator
        get() {
            return episodes.get(currentIndex).getId()
        }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    public override fun getCurrent(i: Int): Object {
        return CollectionsKt.getOrNull<Any>(episodes, currentIndex + i)
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    public override fun generateLinks(
        z: Boolean,
        z2: Boolean,
        function1: Function1<Tuples<out ExtractorLink?, ExtractorUri?>?, Unit>,
        function12: Function1<SubtitleData?, Unit>,
        i: Int,
        continuation: Continuation<in Boolean?>?
    ): Object {
        var folder: List<Tuples<String?, Uri?>>
        val extractorUri: ExtractorUri = episodes.get(currentIndex + i)
        function1.invoke(Tuples<Any?, Any?>(null, extractorUri))
        val context: Context? = AcraApplication.Companion.context
        if (context != null) {
            val relativePath: String? = extractorUri.relativePath
            val displayName: String? = extractorUri.displayName
            if ((displayName != null) && (relativePath != null) && ((VideoDownloadManager.INSTANCE.getFolder(
                    context,
                    relativePath,
                    extractorUri.basePath
                ).also({ folder = it })) != null)
            ) {
                val it: Iterator<T> = folder.iterator()
                while (it.hasNext()) {
                    val tuples: Tuples<*, *> = it.next()
                    val removeSuffix: String =
                        StringsKt.removeSuffix(displayName, ".mp4" as CharSequence?)
                    if (!Intrinsics.areEqual(
                            tuples.getFirst(),
                            extractorUri.displayName
                        ) && StringsKt.`startsWith$default`(
                            tuples.getFirst() as String?,
                            removeSuffix,
                            false,
                            2,
                            null as Object?
                        )
                    ) {
                        var removeSuffix2: String? = StringsKt.removeSuffix(
                            StringsKt.removePrefix(
                                StringsKt.trim(
                                    StringsKt.removeSuffix(
                                        StringsKt.removeSuffix(
                                            StringsKt.removeSuffix(
                                                StringsKt.removePrefix(
                                                    tuples.getFirst() as String?,
                                                    removeSuffix as CharSequence?
                                                ),
                                                ".vtt" as CharSequence?
                                            ), ".srt" as CharSequence?
                                        ),
                                        ".txt" as CharSequence?
                                    ) as CharSequence?
                                ).toString(), "(" as CharSequence?
                            ), ")" as CharSequence?
                        )
                        if (StringsKt.isBlank(removeSuffix2)) {
                            removeSuffix2 = context.getString(R.string.default_subtitles)
                            Intrinsics.checkNotNullExpressionValue(
                                removeSuffix2,
                                "ctx.getString(R.string.default_subtitles)"
                            )
                        }
                        val uri: String = (tuples.getSecond() as Uri).toString()
                        Intrinsics.checkNotNullExpressionValue(uri, "file.second.toString()")
                        function12.invoke(
                            SubtitleData(
                                removeSuffix2,
                                uri,
                                SubtitleOrigin.DOWNLOADED_FILE,
                                PlayerSubtitleHelper.Companion.Companion.toSubtitleMimeType(
                                    removeSuffix
                                ),
                                null,
                                16,
                                null
                            )
                        )
                    }
                }
            }
        }
        return boxing.boxBoolean(true)
    }
}