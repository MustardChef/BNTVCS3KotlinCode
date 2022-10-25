package com.lagradost.cloudstream3.p041ui.home

import android.view.View
import com.lagradost.cloudstream3.utils.AppUtils
import kotlin.jvm.internal.Intrinsics

/* compiled from: HomeFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", FirebaseAnalytics.Param.INDEX, "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.home.HomeFragment$onViewCreated$14 */ /* loaded from: classes3.dex */
internal class `HomeFragment$onViewCreated$14`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: HomeFragment
) : Lambda<Any?>(1), Function1<Integer, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(num: Integer) {
        invoke(num.intValue())
        return Unit.INSTANCE
    }

    override fun invoke(i: Int) {
        var cardList: List<SearchResponse>
        var searchResponse: SearchResponse
        val recyclerView: RecyclerView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_main_poster_recyclerview) as RecyclerView?
        val homeChildItemAdapter: HomeChildItemAdapter? =
            (if (recyclerView != null) recyclerView.getAdapter() else null)
        if ((homeChildItemAdapter == null) || ((homeChildItemAdapter.getCardList()
                .also({ cardList = it })) == null) || ((cardList.get(i)
                .also({ searchResponse = it })) == null)
        ) {
            return
        }
        val homeFragment: HomeFragment = `this$0`
        val materialButton: MaterialButton? =
            homeFragment.`_$_findCachedViewById`(C4761R.C4764id.home_main_play) as MaterialButton?
        if (materialButton != null) {
            materialButton.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$HomeFragment$onViewCreated$14$o-ORzw4FhEw6uhFcnS2ACKLFQ2U
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8650invoke$lambda2$lambda0`(this@HomeFragment, searchResponse, view)
                }
            })
        }
        val materialButton2: MaterialButton? =
            homeFragment.`_$_findCachedViewById`(C4761R.C4764id.home_main_info) as MaterialButton?
        if (materialButton2 != null) {
            materialButton2.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$HomeFragment$onViewCreated$14$7JLlQMELjQeWbHJ_MDPWgImYP2Y
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8651invoke$lambda2$lambda1`(this@HomeFragment, searchResponse, view)
                }
            })
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-2$lambda-0  reason: not valid java name */
        fun `m8650invoke$lambda2$lambda0`(
            `this$0`: HomeFragment,
            random: SearchResponse?,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(random, "\$random")
            AppUtils.`loadSearchResult$default`(
                AppUtils.INSTANCE,
                `this$0`.getActivity(),
                random,
                1,
                null,
                4,
                null
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-2$lambda-1  reason: not valid java name */
        fun `m8651invoke$lambda2$lambda1`(
            `this$0`: HomeFragment,
            random: SearchResponse?,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(random, "\$random")
            AppUtils.`loadSearchResult$default`(
                AppUtils.INSTANCE,
                `this$0`.getActivity(),
                random,
                0,
                null,
                6,
                null
            )
        }
    }
}