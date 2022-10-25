package com.lagradost.cloudstream3.p041ui.player

import android.net.Uri
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: SponsorFileGenerator.kt */
@Metadata(
    m108d1 = ["\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007Ja\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\"\u0010\u0017\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019\u0012\u0004\u0012\u00020\u001c0\u00182\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u00182\u0006\u0010\u001f\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u000f\u0010$\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020 H\u0016J\b\u0010(\u001a\u00020\u000bH\u0016J\b\u0010)\u001a\u00020\u000bH\u0016J\b\u0010*\u001a\u00020\u001cH\u0016J\b\u0010+\u001a\u00020\u001cH\u0016R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/SponsorFileGenerator;", "Lcom/lagradost/cloudstream3/ui/player/IGenerator;", "links", "", "", "name", "apiName", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getApiName", "()Ljava/lang/String;", "hasCache", "", "getHasCache", "()Z", "loadResponse", "Lcom/lagradost/cloudstream3/LoadResponse;", "getLoadResponse", "()Lcom/lagradost/cloudstream3/LoadResponse;", "setLoadResponse", "(Lcom/lagradost/cloudstream3/LoadResponse;)V", "generateLinks", "clearCache", "isCasting", "callback", "Lkotlin/Function1;", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "Lcom/lagradost/cloudstream3/utils/ExtractorUri;", "", "subtitleCallback", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", TypedValues.CycleType.S_WAVE_OFFSET, "", "(ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrent", "", "getCurrentId", "()Ljava/lang/Integer;", "goto", FirebaseAnalytics.Param.INDEX, "hasNext", "hasPrev", "next", "prev", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.SponsorFileGenerator */ /* loaded from: classes3.dex */
class SponsorFileGenerator constructor(links: List<String>, name: String, apiName: String) :
    IGenerator {
    val apiName: String

    // com.lagradost.cloudstream3.p041ui.player.IGenerator
    @get:Override
    override val hasCache: Boolean = false
    private val links: List<String>
    private var loadResponse: LoadResponse? = null
    private val name: String

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    /* renamed from: goto */ public override fun mo8669goto(i: Int) {
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    public override fun hasNext(): Boolean {
        return false
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    public override fun hasPrev(): Boolean {
        return false
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    public override fun next() {
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    public override fun prev() {
    }

    init {
        Intrinsics.checkNotNullParameter(links, "links")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        this.links = links
        this.name = name
        this.apiName = apiName
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    public override fun getLoadResponse(): LoadResponse? {
        return loadResponse
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    public override fun setLoadResponse(loadResponse: LoadResponse?) {
        this.loadResponse = loadResponse
    }

    // com.lagradost.cloudstream3.p041ui.player.IGenerator
    @get:Override
    override val currentId: Integer
        // com.lagradost.cloudstream3.p041ui.player.IGenerator
        get() {
            return 0
        }

    @Override // com.lagradost.cloudstream3.p041ui.player.IGenerator
    public override fun getCurrent(i: Int): Object {
        val parse: Uri = Uri.parse(CollectionsKt.first<Any>(links as List<Object?>?) as String?)
        Intrinsics.checkNotNullExpressionValue(parse, "parse(links.first())")
        return ExtractorUri(
            parse,
            "LiveStream",
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            2044,
            null
        )
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
        val str: String = CollectionsKt.first<Any>(links as List<Object?>?) as String
        function1.invoke(
            Tuples<Any?, Any?>(
                ExtractorLink(
                    str,
                    name,
                    str,
                    str,
                    Qualities.P720.value,
                    true,
                    MapsKt.emptyMap<Any, Any>(),
                    apiName
                ), null
            )
        )
        return boxing.boxBoolean(true)
    }
}