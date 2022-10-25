package com.lagradost.cloudstream3.p041ui.player

import android.content.Context
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: GeneratorPlayer.kt */
@Metadata(
    m108d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"],
    m107d2 = ["<anonymous>", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.GeneratorPlayer$subsPathPicker$1$1 */ /* loaded from: classes3.dex */
class `GeneratorPlayer$subsPathPicker$1$1` constructor(
    uri: Uri?,
    generatorPlayer: GeneratorPlayer
) : Lambda<Any?>(0), Functions<Unit> {
    /* synthetic */ val `$uri`: Uri?
    /* synthetic */ val `this$0`: GeneratorPlayer

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$uri` = uri
        `this$0` = generatorPlayer
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */  override fun invoke() {
        invoke2()
        return Unit.INSTANCE
    }

    @Override // kotlin.jvm.functions.Functions
            /* renamed from: invoke  reason: avoid collision after fix types in other method */    fun invoke2() {
        if (`$uri` == null) {
            return
        }
        var context: Context? = `this$0`.getContext()
        if (context == null && (AcraApplication.Companion.context.also({ context = it })) == null) {
            return
        }
        context.getContentResolver().takePersistableUriPermission(`$uri`, 3)
        val fromUri: UniFile = UniFile.fromUri(context, `$uri`)
        System.out.println(("Loaded subtitle file. Selected URI path: " + `$uri` + " - Name: " + fromUri.getName()) as Object?)
        var name: String? = fromUri.getName()
        if (name == null) {
            name = `$uri`.toString()
        }
        val str: String = name
        Intrinsics.checkNotNullExpressionValue(str, "file.name ?: uri.toString()")
        val uri: String = `$uri`.toString()
        Intrinsics.checkNotNullExpressionValue(uri, "uri.toString()")
        `this$0`.addAndSelectSubtitles(
            SubtitleData(
                str,
                uri,
                SubtitleOrigin.DOWNLOADED_FILE,
                PlayerSubtitleHelper.Companion.Companion.toSubtitleMimeType(str),
                null,
                16,
                null
            )
        )
    }
}