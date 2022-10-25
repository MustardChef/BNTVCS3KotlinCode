package com.lagradost.cloudstream3.p041ui.search

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* compiled from: SearchResultBuilder.kt */
@Metadata(
    m108d1 = ["\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J[\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/search/SearchResultBuilder;", "", "()V", "showCache", "", "", "", "bind", "", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/search/SearchClickCallback;", "card", "Lcom/lagradost/cloudstream3/SearchResponse;", "position", "", "itemView", "Landroid/view/View;", "nextFocusBehavior", "nextFocusUp", "nextFocusDown", "(Lkotlin/jvm/functions/Function1;Lcom/lagradost/cloudstream3/SearchResponse;ILandroid/view/View;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "updateCache", "context", "Landroid/content/Context;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.search.SearchResultBuilder */ /* loaded from: classes4.dex */
class SearchResultBuilder private constructor() {
    /* compiled from: SearchResultBuilder.kt */
    @Metadata(
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.search.SearchResultBuilder$WhenMappings */ /* loaded from: classes4.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

        init {
            val iArr: IntArray = IntArray(SearchQuality.values().size)
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.BlueRay.ordinal()) = 1
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.Cam.ordinal()) = 2
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.CamRip.ordinal()) = 3
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.DVD.ordinal()) = 4
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.HD.ordinal()) = 5
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.HQ.ordinal()) = 6
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.HdCam.ordinal()) = 7
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.Telecine.ordinal()) = 8
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.Telesync.ordinal()) = 9
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.WorkPrint.ordinal()) =
                10
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.SD.ordinal()) = 11
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.FourK.ordinal()) = 12
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.UHD.ordinal()) = 13
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.SDR.ordinal()) = 14
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.HDR.ordinal()) = 15
            com.lagradost.cloudstream3.p041ui.search.iArr.get(SearchQuality.WebRip.ordinal()) = 16
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.p041ui.search.iArr
        }
    }

    fun updateCache(context: Context?) {
        if (context == null) {
            return
        }
        val defaultSharedPreferences: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(context)
        val stringArray: Array<String> =
            context.getResources().getStringArray(R.array.poster_ui_options_values)
        Intrinsics.checkNotNullExpressionValue(
            stringArray,
            "context.resources.getStr…poster_ui_options_values)"
        )
        for (k: String in stringArray) {
            val map: Map<String, Boolean> = showCache
            Intrinsics.checkNotNullExpressionValue(k, "k")
            val bool: Boolean? = map.get(k)
            map.put(
                k,
                Boolean.valueOf(
                    defaultSharedPreferences.getBoolean(
                        k,
                        if (bool != null) bool.booleanValue() else true
                    )
                )
            )
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:221:0x045a  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun bind(
        r25: Function1<SearchClickCallback, Unit>?,
        r26: SearchResponse?,
        r27: Int,
        r28: android.view.View?,
        r29: Boolean?,
        r30: Int?,
        r31: Int?
    ) {
        /*
            Method dump skipped, instructions count: 1474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.search.SearchResultBuilder.bind(kotlin.jvm.functions.Function1, com.lagradost.cloudstream3.SearchResponse, int, android.view.View, java.lang.Boolean, java.lang.Integer, java.lang.Integer):void")
    }

    companion object {
        val INSTANCE: SearchResultBuilder = SearchResultBuilder()
        private val showCache: Map<String, Boolean> = LinkedHashMap()
        private fun `bind$click`(
            function1: Function1<SearchClickCallback, Unit>,
            searchResponse: SearchResponse,
            i: Int,
            view: View?
        ) {
            val i2: Int
            if (searchResponse is ResumeWatchingResult) {
                i2 = 2
            } else if (Intrinsics.areEqual(searchResponse.apiName, ConfigHomeKt.SPONSOR_API_NAME)) {
                i2 = 999
            } else {
                i2 = if (Intrinsics.areEqual(
                        searchResponse.apiName,
                        ConfigHomeKt.IPTV_API_NAME
                    )
                ) SearchAdaptorKt.SEARCH_ACTION_PLAY_FILE_IPTV else 0
            }
            if (view == null) {
                return
            }
            function1.invoke(SearchClickCallback(i2, view, i, searchResponse))
        }

        private fun `bind$longClick`(
            function1: Function1<SearchClickCallback, Unit>,
            i: Int,
            searchResponse: SearchResponse,
            view: View?
        ) {
            if (view == null) {
                return
            }
            function1.invoke(SearchClickCallback(1, view, i, searchResponse))
        }

        private fun `bind$focus`(
            function1: Function1<SearchClickCallback, Unit>,
            i: Int,
            searchResponse: SearchResponse,
            view: View?,
            z: Boolean
        ) {
            if (!z || view == null) {
                return
            }
            function1.invoke(SearchClickCallback(4, view, i, searchResponse))
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-7  reason: not valid java name */
        fun `m8888bind$lambda7`(
            clickCallback: Function1<*, *>,
            card: SearchResponse,
            i: Int,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(clickCallback, "\$clickCallback")
            Intrinsics.checkNotNullParameter(card, "\$card")
            `bind$click`(clickCallback, card, i, view)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-8  reason: not valid java name */
        fun `m8889bind$lambda8`(
            clickCallback: Function1<*, *>,
            card: SearchResponse,
            i: Int,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(clickCallback, "\$clickCallback")
            Intrinsics.checkNotNullParameter(card, "\$card")
            `bind$click`(clickCallback, card, i, view)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-9  reason: not valid java name */
        fun `m8890bind$lambda9`(
            clickCallback: Function1<*, *>,
            i: Int,
            card: SearchResponse,
            view: View?
        ): Boolean {
            Intrinsics.checkNotNullParameter(clickCallback, "\$clickCallback")
            Intrinsics.checkNotNullParameter(card, "\$card")
            `bind$longClick`(clickCallback, i, card, view)
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-10  reason: not valid java name */
        fun `m8885bind$lambda10`(
            clickCallback: Function1<*, *>,
            i: Int,
            card: SearchResponse,
            view: View?
        ): Boolean {
            Intrinsics.checkNotNullParameter(clickCallback, "\$clickCallback")
            Intrinsics.checkNotNullParameter(card, "\$card")
            `bind$longClick`(clickCallback, i, card, view)
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-11  reason: not valid java name */
        fun `m8886bind$lambda11`(
            clickCallback: Function1<*, *>,
            i: Int,
            card: SearchResponse,
            view: View?,
            z: Boolean
        ) {
            Intrinsics.checkNotNullParameter(clickCallback, "\$clickCallback")
            Intrinsics.checkNotNullParameter(card, "\$card")
            `bind$focus`(clickCallback, i, card, view, z)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-12  reason: not valid java name */
        fun `m8887bind$lambda12`(
            clickCallback: Function1<*, *>,
            i: Int,
            card: SearchResponse,
            view: View?,
            z: Boolean
        ) {
            Intrinsics.checkNotNullParameter(clickCallback, "\$clickCallback")
            Intrinsics.checkNotNullParameter(card, "\$card")
            `bind$focus`(clickCallback, i, card, view, z)
        }
    }
}