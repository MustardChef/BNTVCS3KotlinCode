package com.lagradost.cloudstream3.extractors

import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: Vidstream.kt */
@Metadata(
    m108d1 = ["\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002JK\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\u000cX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Vidstream;", "", "mainUrl", "", "(Ljava/lang/String;)V", "getMainUrl", "()Ljava/lang/String;", "name", "getName", "normalApis", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/extractors/MultiQuality;", "Lkotlin/collections/ArrayList;", "getDownloadUrl", "id", "getExtractorUrl", "getUrl", "", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Vidstream(mainUrl: String) {
    val mainUrl: String
    val name: String
    val normalApis: ArrayList<MultiQuality>

    init {
        Intrinsics.checkNotNullParameter(mainUrl, "mainUrl")
        this.mainUrl = mainUrl
        name = "Vidstream"
        normalApis = CollectionsKt.arrayListOf(MultiQuality())
    }

    private fun getExtractorUrl(str: String): String {
        return mainUrl + "/streaming.php?id=" + str
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun getDownloadUrl(str: String): String {
        return mainUrl + "/download?id=" + str
    }

    fun getUrl(
        str: String,
        z: Boolean,
        function1: Function1<SubtitleFile?, Unit>?,
        function12: Function1<ExtractorLink?, Unit>,
        continuation: Continuation<in Boolean?>?
    ): Object {
        val extractorUrl = getExtractorUrl(str)
        ParCollections.argamap(
            `Vidstream$getUrl$2`(this, str, function1, function12, null),
            `Vidstream$getUrl$3`(this, str, extractorUrl, function1, function12, null),
            `Vidstream$getUrl$4`(extractorUrl, z, function1, function12, null)
        )
        return boxing.boxBoolean(true)
    }
}