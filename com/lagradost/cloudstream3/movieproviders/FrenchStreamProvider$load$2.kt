package com.lagradost.cloudstream3.movieproviders

import com.lagradost.cloudstream3.LoadResponse
import org.jsoup.nodes.Element
import java.util.List
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: FrenchStreamProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `FrenchStreamProvider$load$2`(
    objectRef: ObjectRef<String?>,
    document: Document,
    list: List<String>,
    str: String
) : Lambda<Any?>(1), Function1<MovieLoadResponse, Unit> {
    /* synthetic */ val `$description`: String
    /* synthetic */ val `$poster`: ObjectRef<String>
    /* synthetic */ val `$soup`: Document
    /* synthetic */ val `$tagsList`: List<String>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$poster` = objectRef
        `$soup` = document
        `$tagsList` = list
        `$description` = str
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(movieLoadResponse: MovieLoadResponse) {
        invoke2(movieLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newMovieLoadResponse: MovieLoadResponse) {
        var text: String?
        Intrinsics.checkNotNullParameter(newMovieLoadResponse, "\$this\$newMovieLoadResponse")
        newMovieLoadResponse.posterUrl = `$poster`.element
        val movieLoadResponse: MovieLoadResponse = newMovieLoadResponse
        LoadResponse.Companion.addRating(
            movieLoadResponse,
            `$soup`.select("div.fr-count > div").text()
        )
        val select: Elements = `$soup`.select("ul.flist-col > li")
        Intrinsics.checkNotNullExpressionValue(select, "soup.select(\"ul.flist-col > li\")")
        val element = CollectionsKt.getOrNull(select, 2) as Element?
        newMovieLoadResponse.setYear(
            if (element == null || element.text()
                    .also { text = it } == null
            ) null else StringsKt.toIntOrNull(text))
        newMovieLoadResponse.tags = `$tagsList`
        newMovieLoadResponse.plot = `$description`
        val companion: LoadResponse.Companion = LoadResponse.Companion
        val selectFirst: Element = `$soup`.selectFirst("div.fleft > span > a")
        companion.addTrailer(
            movieLoadResponse,
            selectFirst?.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
        )
    }
}