package com.lagradost.cloudstream3.extractors

import com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor
import com.lagradost.cloudstream3.ParCollections.argamap
import com.lagradost.cloudstream3.utils.M3u8Helper.Companion.Companion.`generateM3u8$default`
import com.lagradost.cloudstream3.utils.ExtractorApi.Companion.`getSafeUrl$default`
import com.lagradost.cloudstream3.MainActivityKt.getApp
import com.lagradost.cloudstream3.utils.ExtractorApiKt.getQualityFromName
import com.lagradost.cloudstream3.utils.ExtractorApiKt.extractorApis
import com.lagradost.cloudstream3.utils.ExtractorApi.requiresReferer
import com.lagradost.cloudstream3.utils.ExtractorApi.mainUrl
import com.lagradost.cloudstream3.utils.ExtractorApi.getSafeUrl
import com.lagradost.cloudstream3.extractors.helper.WcoHelper
import com.lagradost.cloudstream3.extractors.helper.WcoHelper.Companion.ExternalKeys
import com.lagradost.cloudstream3.extractors.helper.WcoHelper.Companion.NewExternalKeys
import kotlin.jvm.internal.DefaultConstructorMarker
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.jvm.JvmOverloads
import com.lagradost.cloudstream3.extractors.helper.AsianEmbedHelper
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.extractors.helper.VstreamhubHelper
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.extractors.helper.``WcoHelper$Companion$getKeys$1`
import org.jsoup.nodes.Element
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: Vidstream.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.extractors.Vidstream\$getUrl$3",
    m98f = "Vidstream.kt",
    m97i = [0],
    m96l = [52],
    m95m = "invokeSuspend",
    m94n = ["link"],
    m93s = ["L$0"]
) /* loaded from: classes3.dex */
class `Vidstream$getUrl$3`(/* synthetic */val `this$0`: Vidstream, /* synthetic */
                                          val `$id`: String, /* synthetic */
                                          val `$extractorUrl`: String,
                                          function1: Function1<in SubtitleFile?, Unit>?,
                                          function12: Function1<in ExtractorLink?, Unit>,
                                          continuation: Continuation<in `Vidstream$getUrl$3`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Object?>?, Object?> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink?, Unit>
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile?, Unit>?
    var `L$0`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$subtitleCallback` = function1
        `$callback` = function12
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `Vidstream$getUrl$3`(
            `this$0`,
            `$id`,
            `$extractorUrl`,
            `$subtitleCallback`,
            `$callback`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override operator fun invoke(continuation: Continuation<in Object?>): Object {
        return invoke2(continuation as Continuation<Object?>)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(continuation: Continuation<Object?>?): Object {
        return (create(continuation) as `Vidstream$getUrl$3`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val downloadUrl: String?
        val obj2: Object
        val str: String?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            downloadUrl = `this$0`.getDownloadUrl(`$id`)
            System.out.println("Generated vidstream download link: $downloadUrl" as Object)
            `L$0` = downloadUrl
            label = 1
            obj2 = Requests.`get$default`(
                MainActivityKt.getApp(),
                downloadUrl,
                null,
                `$extractorUrl`,
                null,
                null,
                false,
                0,
                null,
                0L,
                null,
                false,
                this,
                2042,
                null
            )
            if (obj2 === coroutine_suspended) {
                return coroutine_suspended
            }
            str = downloadUrl
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
            obj2 = obj
            str = `L$0`
        }
        val niceResponse: NiceResponse = obj2 as NiceResponse
        val parse: Document = Jsoup.parse(niceResponse.getText())
        val regex = Regex("(\\d+)P")
        val select: Elements = parse.select(".dowload > a")
        return if (select != null) {
            ParCollections.apmap(
                select,
                C47751(
                    regex,
                    str,
                    `$subtitleCallback`,
                    `$callback`,
                    `this$0`,
                    niceResponse,
                    null
                )
            )
        } else null
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: Vidstream.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\u008a@"],
        m107d2 = ["<anonymous>", "", "element", "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.extractors.Vidstream\$getUrl$3$1",
        m98f = "Vidstream.kt",
        m97i = [0, 0, 0],
        m96l = [65],
        m95m = "invokeSuspend",
        m94n = ["element", ShareConstants.WEB_DIALOG_PARAM_HREF, "qual"],
        m93s = ["L$0", "L$1", "L$2"]
    ) /* renamed from: com.lagradost.cloudstream3.extractors.Vidstream$getUrl$3$1 */ /* loaded from: classes3.dex */
    class C47751 internal constructor(/* synthetic */val `$qualityRegex`: Regex, /* synthetic */
                                                     val `$link`: String?,
                                                     function1: Function1<in SubtitleFile?, Unit>?,
                                                     function12: Function1<in ExtractorLink?, Unit>,
                                                     vidstream: Vidstream,
                                                     niceResponse: NiceResponse,
                                                     continuation: Continuation<in C47751?>?
    ) : SuspendLambda(2, continuation), Function2<Element, Continuation<in Unit>?, Object> {
        /* synthetic */ val `$callback`: Function1<ExtractorLink?, Unit>
        /* synthetic */ val `$page`: NiceResponse
        /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile?, Unit>?

        /* synthetic */
        var `L$0`: Object? = null
        var `L$1`: Object? = null
        var `L$2`: Object? = null
        var label = 0
        /* synthetic */ val `this$0`: Vidstream

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$subtitleCallback` = function1
            `$callback` = function12
            `this$0` = vidstream
            `$page` = niceResponse
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
            val c47751 = C47751(
                `$qualityRegex`,
                `$link`,
                `$subtitleCallback`,
                `$callback`,
                `this$0`,
                `$page`,
                continuation
            )
            c47751.`L$0` = obj
            return c47751
        }

        @Override // kotlin.jvm.functions.Function2
        override fun invoke(element: Element, continuation: Continuation<in Unit>?): Object {
            return (create(element, continuation) as C47751).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val element: Element?
            val valueOf: String
            var destructured: Destructured
            val loadExtractor: Object
            val str: String?
            val str2: String?
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                element = `L$0`
                val attr: String = element!!.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
                    ?: return Unit.INSTANCE
                val text: String = element.text()
                Intrinsics.checkNotNullExpressionValue(text, "element.text()")
                if (StringsKt.`contains$default`(
                        text as CharSequence,
                        "HDP" as CharSequence,
                        false,
                        2,
                        null as Object?
                    )
                ) {
                    valueOf = "1080"
                } else {
                    val regex = `$qualityRegex`
                    val text2: String = element.text()
                    Intrinsics.checkNotNullExpressionValue(text2, "element.text()")
                    val `find$default` = Regex.`find$default`(regex, text2, 0, 2, null)
                    valueOf =
                        String.valueOf(if (`find$default` == null || `find$default`.destructured.also {
                                destructured = it
                            } == null) null else destructured.getMatch().getGroupValues().get(1))
                }
                `L$0` = element
                `L$1` = attr
                `L$2` = valueOf
                label = 1
                loadExtractor = ExtractorApiKt.loadExtractor(
                    attr,
                    `$link`,
                    `$subtitleCallback`,
                    `$callback`,
                    this
                )
                if (loadExtractor === coroutine_suspended) {
                    return coroutine_suspended
                }
                str = attr
                str2 = valueOf
            } else if (i != 1) {
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                str2 = `L$2`
                ResultKt.throwOnFailure(obj)
                str = `L$1`
                element = `L$0`
                loadExtractor = obj
            }
            if (!(loadExtractor as Boolean).booleanValue()) {
                val function1 = `$callback`
                val name: String? = `this$0`.name
                val name2: String? = `this$0`.name
                val url: String = `$page`.getUrl()
                val qualityFromName: Int = ExtractorApiKt.getQualityFromName(str2)
                val attr2: String = element!!.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
                Intrinsics.checkNotNullExpressionValue(attr2, "element.attr(\"href\")")
                function1.invoke(
                    ExtractorLink(
                        name!!,
                        name2!!,
                        str!!,
                        url,
                        qualityFromName,
                        StringsKt.`contains$default`(
                            attr2 as CharSequence,
                            ".m3u8" as CharSequence,
                            false,
                            2,
                            null as Object?
                        ),
                        null,
                        null,
                        192,
                        null
                    )
                )
            }
            return Unit.INSTANCE
        }
    }
}