package com.lagradost.cloudstream3.p041ui.result

import android.view.View
import kotlin.jvm.internal.Intrinsics

/* compiled from: ResultFragmentTV.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "episodeList", "", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$onViewCreated$19 */ /* loaded from: classes4.dex */
internal class `ResultFragmentTV$onViewCreated$19` constructor(/* synthetic */val `this$0`: ResultFragmentTV,
                                                                              num: Integer,
                                                                              num2: Integer,
                                                                              str: String,
                                                                              mainAPI: MainAPI
) : Lambda<Any?>(1), Function1<List<ResultEpisode?>?, Unit> {
    /* synthetic */ val `$api`: MainAPI
    /* synthetic */ val `$apiName`: String
    /* synthetic */ val `$resumeEpisode`: Integer
    /* synthetic */ val `$resumeSeason`: Integer

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$resumeEpisode` = num
        `$resumeSeason` = num2
        `$apiName` = str
        `$api` = mainAPI
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(list: List<ResultEpisode?>?) {
        invoke2(list)
        return Unit.INSTANCE
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0151, code lost:
        if (r4 == null) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0223  */ /* JADX WARN: Removed duplicated region for block: B:105:0x022e  */ /* JADX WARN: Removed duplicated region for block: B:82:0x01d1  */ /* JADX WARN: Removed duplicated region for block: B:83:0x01dc  */ /* JADX WARN: Removed duplicated region for block: B:93:0x01fa  */ /* JADX WARN: Removed duplicated region for block: B:94:0x0205  */ /* renamed from: invoke  reason: avoid collision after fix types in other method */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun invoke2(r15: List<ResultEpisode?>?) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.result.ResultFragmentTV\$onViewCreated$19.invoke2(java.util.List):void")
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-6$lambda-2  reason: not valid java name */
        fun `m8840invoke$lambda6$lambda2`(
            episodeList: List,
            resume: ResumeWatching,
            `this$0`: ResultFragmentTV?,
            apiName: String?,
            api: MainAPI?,
            view: View?
        ) {
            var obj: Object?
            var z: Boolean
            Intrinsics.checkNotNullParameter(episodeList, "\$episodeList")
            Intrinsics.checkNotNullParameter(resume, "\$resume")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(apiName, "\$apiName")
            Intrinsics.checkNotNullParameter(api, "\$api")
            val it: Iterator = episodeList.iterator()
            while (true) {
                if (!it.hasNext()) {
                    obj = null
                    break
                }
                obj = it.next()
                val id: Int = (obj as ResultEpisode?).getId()
                val episodeId: Integer? = resume.getEpisodeId()
                if (episodeId != null && id == episodeId.intValue()) {
                    z = true
                    continue
                } else {
                    z = false
                    continue
                }
                if (z) {
                    break
                }
            }
            val resultEpisode: ResultEpisode? = obj
            if (resultEpisode != null) {
                ResultFragmentTV.Companion.`onViewCreated$handleAction`(
                    `this$0`,
                    apiName,
                    api,
                    EpisodeClickEvent(1, resultEpisode)
                )
            }
        }
    }
}