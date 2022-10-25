package com.lagradost.cloudstream3.p041ui.home

import android.widget.TextView
import kotlin.jvm.internal.Intrinsics

/* compiled from: HomeFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "apiName", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.home.HomeFragment$onViewCreated$3 */ /* loaded from: classes3.dex */
internal class `HomeFragment$onViewCreated$3`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: HomeFragment
) : Lambda<Any?>(1), Function1<String?, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(str: String?) {
        invoke2(str)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(apiName: String?) {
        var z: Boolean
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        `this$0`.setCurrentApiName(apiName)
        AcraApplication.Companion.setKey<Any>(DataStoreKt.HOMEPAGE_API, apiName)
        val extendedFloatingActionButton: ExtendedFloatingActionButton? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_api_fab) as ExtendedFloatingActionButton?
        if (extendedFloatingActionButton != null) {
            extendedFloatingActionButton.setText(apiName)
        }
        val textView: TextView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_provider_name) as TextView?
        if (textView != null) {
            textView.setText(apiName)
        }
        try {
            val searchView: SearchView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_search) as SearchView?
            if (searchView != null) {
                val string: String = `this$0`.getString(R.string.search_hint_site)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.search_hint_site)"
                )
                val format: String = String.format(string, Arrays.copyOf(arrayOf(apiName), 1))
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
                searchView.setQueryHint(format)
            }
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
        val textView2: TextView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_provider_meta_info) as TextView?
        if (textView2 != null) {
            textView2.setVisibility(8)
        }
        val apiFromNameNull: MainAPI? = APIHolder.INSTANCE.getApiFromNameNull(apiName)
        if (apiFromNameNull != null) {
            val homeFragment: HomeFragment = `this$0`
            val tuplesArr: Array<Tuples<*, *>> = arrayOf(
                Tuples<Any?, Any?>(
                    Integer.valueOf(R.string.movies as Int),
                    CollectionsKt.listOf<TvType>(TvType.Movie)
                ),
                Tuples<Any?, Any?>(
                    Integer.valueOf(R.string.tv_series as Int),
                    CollectionsKt.listOf<TvType>(TvType.TvSeries)
                ),
                Tuples<Any?, Any?>(
                    Integer.valueOf(R.string.documentaries as Int),
                    CollectionsKt.listOf<TvType>(TvType.Documentary)
                ),
                Tuples<Any?, Any?>(
                    Integer.valueOf(R.string.cartoons as Int),
                    CollectionsKt.listOf<TvType>(TvType.Cartoon)
                ),
                Tuples<Any?, Any?>(
                    Integer.valueOf(R.string.anime as Int),
                    CollectionsKt.listOf<Object>(
                        *arrayOf<TvType>(
                            TvType.Anime,
                            TvType.OVA,
                            TvType.AnimeMovie
                        ) as Array<Object>
                    )
                ),
                Tuples<Any?, Any?>(
                    Integer.valueOf(R.string.torrent as Int),
                    CollectionsKt.listOf<TvType>(TvType.Torrent)
                ),
                Tuples<Any?, Any?>(
                    Integer.valueOf(R.string.asian_drama as Int),
                    CollectionsKt.listOf<TvType>(TvType.AsianDrama)
                )
            )
            val arrayList: ArrayList = ArrayList()
            for (obj: Object? in CollectionsKt.listOf<Object>(*tuplesArr as Array<Object>)) {
                val supportedTypes: Set<TvType> = apiFromNameNull.supportedTypes
                if (!(supportedTypes is Collection) || !supportedTypes.isEmpty()) {
                    for (tvType: TvType? in supportedTypes) {
                        if ((obj.getSecond() as List).contains(tvType)) {
                            z = true
                            break
                        }
                    }
                }
                z = false
                if (z) {
                    arrayList.add(obj)
                }
            }
            val arrayList2: ArrayList = arrayList
            val textView3: TextView? =
                homeFragment.`_$_findCachedViewById`(C4761R.C4764id.home_provider_meta_info) as TextView?
            if (textView3 != null) {
                textView3.setText(
                    CollectionsKt.`joinToString$default`(
                        arrayList2,
                        ", ",
                        null,
                        null,
                        0,
                        null,
                        `HomeFragment$onViewCreated$3$1$1`(homeFragment),
                        30,
                        null
                    )
                )
            }
            val home_provider_meta_info: TextView? =
                homeFragment.`_$_findCachedViewById`(C4761R.C4764id.home_provider_meta_info) as TextView?
            if (home_provider_meta_info == null) {
                return
            }
            Intrinsics.checkNotNullExpressionValue(
                home_provider_meta_info,
                "home_provider_meta_info"
            )
            home_provider_meta_info.setVisibility(0)
        }
    }
}