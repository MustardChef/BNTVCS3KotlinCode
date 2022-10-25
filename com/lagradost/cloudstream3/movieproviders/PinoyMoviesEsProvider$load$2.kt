package com.lagradost.cloudstream3.movieproviders

import com.fasterxml.jackson.core.type.TypeReference
import com.lagradost.cloudstream3.utils.AppUtils
import java.util.List
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: PinoyMoviesEsProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "datapost", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.PinoyMoviesEsProvider\$load$2",
    m98f = "PinoyMoviesEsProvider.kt",
    m97i = [],
    m96l = [200],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `PinoyMoviesEsProvider$load$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `$url`: String, /* synthetic */
    val `$listOfLinks`: List<String>,
    continuation: Continuation<in `PinoyMoviesEsProvider$load$2`?>?
) : SuspendLambda(2, continuation), Function2<String, Continuation<in Unit>?, Object> {
    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `pinoyMoviesEsProvider$load$2` =
            `PinoyMoviesEsProvider$load$2`(`$url`, `$listOfLinks`, continuation)
        `pinoyMoviesEsProvider$load$2`.`L$0` = obj
        return `pinoyMoviesEsProvider$load$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(str: String, continuation: Continuation<in Unit>?): Object {
        return (create(
            str,
            continuation
        ) as `PinoyMoviesEsProvider$load$2`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val `post$default`: Object
        var text: String?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        val z = false
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val mapOf: Map = MapsKt.mapOf(
                Tuples<Any?, Any?>("action", "doo_player_ajax"),
                Tuples<Any?, Any?>("post", `L$0` as String?),
                Tuples<Any?, Any?>("nume", "1"),
                Tuples<Any?, Any?>("type", "movie")
            )
            label = 1
            `post$default` = Requests.`post$default`(
                MainActivityKt.getApp(),
                "https://pinoymovies.es/wp-admin/admin-ajax.php ",
                null,
                `$url`,
                null,
                null,
                mapOf,
                null,
                null,
                null,
                false,
                0,
                null,
                0L,
                null,
                false,
                this,
                32730,
                null
            )
            if (`post$default` === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
            `post$default` = obj
        }
        val select: Elements = (`post$default` as NiceResponse).getDocument().select("body")
        var embedUrl: EmbedUrl? = null
        val obj2: String? = if (select == null || select.text()
                .also { text = it } == null
        ) null else StringsKt.trim(text as CharSequence?).toString()
        if (!(if (obj2 == null || StringsKt.isBlank(obj2)) true else true)) {
            val appUtils = AppUtils.INSTANCE
            if (obj2 != null) {
                try {
                    embedUrl = MainAPIKt.getMapper().readValue(
                        obj2,
                        object :
                            TypeReference<EmbedUrl?>() { // from class: com.lagradost.cloudstream3.movieproviders.PinoyMoviesEsProvider$load$2$invokeSuspend$$inlined$tryParseJson$1
                        })
                } catch (unused: Exception) {
                }
            }
            val embedUrl2: EmbedUrl? = embedUrl
            if (embedUrl2 != null) {
                boxing.boxBoolean(`$listOfLinks`.add(embedUrl2.getEmbed_url()))
            }
        }
        return Unit.INSTANCE
    }
}