package com.lagradost.cloudstream3.movieproviders

import com.fasterxml.jackson.core.type.TypeReference
import com.lagradost.cloudstream3.utils.AppUtils
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: KdramaHoodProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "item", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.KdramaHoodProvider\$loadLinks$2",
    m98f = "KdramaHoodProvider.kt",
    m97i = [],
    m96l = [bqk.f6536aw, 283, 288],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes3.dex */
internal class `KdramaHoodProvider$loadLinks$2`(
    intRef: IntRef,
    kdramaHoodProvider: KdramaHoodProvider,
    function1: Function1<SubtitleFile?, Unit>,
    function12: Function1<ExtractorLink?, Unit>,
    continuation: Continuation<in `KdramaHoodProvider$loadLinks$2`?>?
) : SuspendLambda(2, continuation), Function2<String, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink?, Unit>
    /* synthetic */ val `$count`: IntRef
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile?, Unit>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0
    /* synthetic */ val `this$0`: KdramaHoodProvider

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$count` = intRef
        `this$0` = kdramaHoodProvider
        `$subtitleCallback` = function1
        `$callback` = function12
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `kdramaHoodProvider$loadLinks$2` = `KdramaHoodProvider$loadLinks$2`(
            `$count`,
            `this$0`,
            `$subtitleCallback`,
            `$callback`,
            continuation
        )
        `kdramaHoodProvider$loadLinks$2`.`L$0` = obj
        return `kdramaHoodProvider$loadLinks$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(str: String, continuation: Continuation<in Unit>?): Object {
        return (create(
            str,
            continuation
        ) as `KdramaHoodProvider$loadLinks$2`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val `url$default`: Object
        var value: String?
        var value2: String?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val str = `L$0` as String?
            if (!StringsKt.isBlank(str)) {
                `$count`.element++
                if (StringsKt.`startsWith$default`(
                        str,
                        `this$0`.getMainUrl(),
                        false,
                        2,
                        null as Object?
                    )
                ) {
                    val substring: String = str.substring(`this$0`.getMainUrl().length())
                    Intrinsics.checkNotNullExpressionValue(
                        substring,
                        "this as java.lang.String).substring(startIndex)"
                    )
                    try {
                        val `find$default` = Regex.`find$default`(
                            Regex("(?<=sources: )([\\s\\S]*?)(?<=])"),
                            substring,
                            0,
                            2,
                            null
                        )
                        if (`find$default` != null && `find$default`.value.also {
                                value2 = it
                            } != null) {
                            val function1: Function1<ExtractorLink, Unit> = `$callback`
                            val kdramaHoodProvider = `this$0`
                            val appUtils = AppUtils.INSTANCE
                            for (responseDatas in MainAPIKt.getMapper().readValue(
                                value2,
                                object :
                                    TypeReference<List<ResponseDatas?>?>() { // from class: com.lagradost.cloudstream3.movieproviders.KdramaHoodProvider$loadLinks$2$invokeSuspend$lambda-1$$inlined$parseJson$1
                                })) {
                                function1.invoke(
                                    ExtractorLink(
                                        kdramaHoodProvider.getName(),
                                        kdramaHoodProvider.getName(),
                                        responseDatas.getFile(),
                                        kdramaHoodProvider.getMainUrl(),
                                        ExtractorApiKt.getQualityFromName(responseDatas.getLabel()),
                                        false,
                                        null,
                                        null,
                                        224,
                                        null
                                    )
                                )
                            }
                        }
                    } catch (e: Exception) {
                        ArchComponentExt.logError(e)
                    }
                    try {
                        val `find$default2` = Regex.`find$default`(
                            Regex("(?<=tracks: )([\\s\\S]*?)(?<=])"),
                            substring,
                            0,
                            2,
                            null
                        )
                        if (`find$default2` != null && `find$default2`.value.also {
                                value = it
                            } != null) {
                            val function12: Function1<SubtitleFile, Unit> = `$subtitleCallback`
                            val `replace$default`: String = StringsKt.`replace$default`(
                                StringsKt.`replace$default`(
                                    StringsKt.`replace$default`(
                                        value,
                                        "file:",
                                        "\"file\":",
                                        false,
                                        4,
                                        null as Object?
                                    ), "label:", "\"label\":", false, 4, null as Object?
                                ), "kind:", "\"kind\":", false, 4, null as Object?
                            )
                            val appUtils2 = AppUtils.INSTANCE
                            for (responseDatas2 in MainAPIKt.getMapper().readValue(
                                `replace$default`,
                                object :
                                    TypeReference<List<ResponseDatas?>?>() { // from class: com.lagradost.cloudstream3.movieproviders.KdramaHoodProvider$loadLinks$2$invokeSuspend$lambda-3$$inlined$parseJson$1
                                })) {
                                function12.invoke(
                                    SubtitleFile(
                                        responseDatas2.getLabel(),
                                        responseDatas2.getFile(),
                                        null,
                                        4,
                                        null
                                    )
                                )
                            }
                        }
                    } catch (e2: Exception) {
                        ArchComponentExt.logError(e2)
                    }
                } else {
                    val fixUrl: String =
                        MainAPIKt.fixUrl(`this$0`, StringsKt.trim(str as CharSequence?).toString())
                    if (StringsKt.`startsWith$default`(
                            fixUrl,
                            "https://asianembed.io",
                            false,
                            2,
                            null as Object?
                        )
                    ) {
                        label = 1
                        if (AsianEmbedHelper.Companion.getUrls(
                                fixUrl,
                                `$subtitleCallback`,
                                `$callback`,
                                this
                            ) === coroutine_suspended
                        ) {
                            return coroutine_suspended
                        }
                    } else if (StringsKt.`startsWith$default`(
                            fixUrl,
                            "https://embedsito.com",
                            false,
                            2,
                            null as Object?
                        )
                    ) {
                        val xStreamCdn = XStreamCdn()
                        xStreamCdn.setDomainUrl("embedsito.com")
                        label = 2
                        `url$default` =
                            ExtractorApi.`getUrl$default`(xStreamCdn, fixUrl, null, this, 2, null)
                        if (`url$default` === coroutine_suspended) {
                            return coroutine_suspended
                        }
                    } else {
                        label = 3
                        if (ExtractorApiKt.loadExtractor(
                                fixUrl,
                                `this$0`.getMainUrl(),
                                `$subtitleCallback`,
                                `$callback`,
                                this
                            ) === coroutine_suspended
                        ) {
                            return coroutine_suspended
                        }
                    }
                }
            }
            return Unit.INSTANCE
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj)
                `url$default` = obj
            } else if (i != 3) {
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            }
        }
        ResultKt.throwOnFailure(obj)
        return Unit.INSTANCE
        val function13: Function1<ExtractorLink, Unit> = `$callback`
        for (extractorLink in `url$default`) {
            function13.invoke(extractorLink)
        }
        return Unit.INSTANCE
    }
}