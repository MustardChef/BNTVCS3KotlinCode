package com.lagradost.cloudstream3.subtitleproviders

import java.util.List

/* compiled from: SubtitleApi.kt */
@Metadata(
    m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JS\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00040\u000cH&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"],
    m107d2 = ["Lcom/lagradost/cloudstream3/subtitleproviders/SubtitleApi;", "", "()V", "getSubtitles", "", "title", "", "year", "lang", "isTvSeries", "", "callback", "Lkotlin/Function1;", "", "Lcom/lagradost/cloudstream3/SubtitleFile;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;)V", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
abstract class SubtitleApi {
    abstract fun getSubtitles(
        str: String?,
        str2: String?,
        str3: String,
        bool: Boolean?,
        function1: Function1<List<SubtitleFile?>?, Unit>
    )

    companion object {
        fun  /* synthetic */`getSubtitles$default`(
            subtitleApi: SubtitleApi,
            str: String?,
            str2: String?,
            str3: String,
            bool: Boolean?,
            function1: Function1<*, *>,
            i: Int,
            obj: Object?
        ) {
            var str2 = str2
            var str3 = str3
            var bool = bool
            if (obj != null) {
                throw UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSubtitles")
            }
            if (i and 2 != 0) {
                str2 = ""
            }
            val str4 = str2
            if (i and 4 != 0) {
                str3 = "vie"
            }
            val str5 = str3
            if (i and 8 != 0) {
                bool = false
            }
            subtitleApi.getSubtitles(str, str4, str5, bool, function1)
        }
    }
}