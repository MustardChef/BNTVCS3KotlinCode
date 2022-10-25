package com.lagradost.cloudstream3.p041ui.browser

import android.widget.ProgressBar
import androidx.navigation.NavController
import androidx.navigation.fragment.Fragment
import com.lagradost.cloudstream3.mvvm.Resource
import kotlin.jvm.internal.Intrinsics

/* compiled from: SubtitleBrowserFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "data", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.browser.SubtitleBrowserFragment$onViewCreated$10 */ /* loaded from: classes.dex */
internal class `SubtitleBrowserFragment$onViewCreated$10`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: SubtitleBrowserFragment
) : Lambda<Any?>(1), Function1<Resource<out Object?>?, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(resource: Resource<out Object?>?) {
        invoke2(resource)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(data: Resource<out Object?>?) {
        var savedStateHandle: SavedStateHandle
        Intrinsics.checkNotNullParameter(data, "data")
        if (data is Resource.Success<*>) {
            (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.loading) as ProgressBar?).setVisibility(
                8
            )
            val value: Object = data.value
            Objects.requireNonNull(
                value,
                "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            )
            KeyboardUtils.hideSoftInput(`this$0`.getActivity())
            val findNavController: NavController = Fragment.findNavController(
                `this$0`
            )
            val arrayList: ArrayList = ArrayList()
            for (obj: Object? in value) {
                val str: String? = obj
                if (StringsKt.`endsWith$default`(
                        str,
                        "srt",
                        false,
                        2,
                        null as Object?
                    ) || StringsKt.`endsWith$default`(
                        str,
                        "vtt",
                        false,
                        2,
                        null as Object?
                    ) || StringsKt.`endsWith$default`(str, "xml", false, 2, null as Object?)
                ) {
                    arrayList.add(obj)
                }
            }
            val str2: String = CollectionsKt.first<Any>(arrayList as List<Object?>?) as String
            val previousBackStackEntry: NavBackStackEntry? =
                findNavController.getPreviousBackStackEntry()
            if (previousBackStackEntry != null && (previousBackStackEntry.getSavedStateHandle()
                    .also({ savedStateHandle = it })) != null
            ) {
                savedStateHandle.set<Any>("your_key", str2)
            }
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                UIHelper.INSTANCE.popCurrentPage(activity)
            }
        } else if (data is Loading) {
            val progressBar: ProgressBar? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.loading) as ProgressBar?
            if (progressBar != null) {
                progressBar.setIndeterminate(true)
            }
            val progressBar2: ProgressBar? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.loading) as ProgressBar?
            if (progressBar2 == null) {
                return
            }
            progressBar2.setVisibility(0)
        } else if (data is Resource.Failure) {
            val progressBar3: ProgressBar? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.loading) as ProgressBar?
            if (progressBar3 != null) {
                progressBar3.setVisibility(8)
            }
            Toast.makeText(`this$0`.getContext(), "Error ", 0).show()
        }
    }
}