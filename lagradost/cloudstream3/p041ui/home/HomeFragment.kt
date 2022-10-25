package com.lagradost.cloudstream3.p041ui.home

import android.app.Activity
import com.lagradost.cloudstream3.mvvm.Resource
import com.lagradost.cloudstream3.p041ui.quicksearch.QuickSearchFragment
import com.lagradost.cloudstream3.utils.AppUtils
import com.lagradost.cloudstream3.utils.Event
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.Reflection

/* compiled from: HomeFragment.kt */
@Metadata(
    m108d1 = ["\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 32\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u0016H\u0016J\u001a\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0017J\b\u0010+\u001a\u00020\u0016H\u0002J!\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00142\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010/J\n\u00100\u001a\u000201*\u000202R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\u000c\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/home/HomeFragment;", "Lcom/phimhd/BaseFragment;", "()V", "apiChangeClickListener", "Landroid/view/View\$OnClickListener;", "currentApiName", "", "getCurrentApiName", "()Ljava/lang/String;", "setCurrentApiName", "(Ljava/lang/String;)V", "currentHomePage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "homeViewModel", "Lcom/lagradost/cloudstream3/ui/home/HomeViewModel;", "getHomeViewModel", "()Lcom/lagradost/cloudstream3/ui/home/HomeViewModel;", "homeViewModel\$delegate", "Lkotlin/Lazy;", "toggleRandomButton", "", "fixGrid", "", "focusCallback", "card", "Lcom/lagradost/cloudstream3/SearchResponse;", "homeHandleSearch", "callback", "Lcom/lagradost/cloudstream3/ui/search/SearchClickCallback;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "reloadStored", "toggleMainVisibility", "visible", "recyclerViewRandomVisible", "(ZLjava/lang/Boolean;)V", "toPage", "Lcom/lagradost/cloudstream3/Page;", "Lcom/lagradost/cloudstream3/MainAPI;", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.home.HomeFragment */ /* loaded from: classes3.dex */
class HomeFragment : BaseFragment() {
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    val apiChangeClickListener: OnClickListener = object : OnClickListener() {
        // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$HomeFragment$7A2KtSo9iqf3WrjvtN3QGTXehvc
        @Override // android.view.View.OnClickListener
        fun onClick(view: View?) {
            Companion.`m8630apiChangeClickListener$lambda3`(this@HomeFragment, view)
        }
    }
    var currentApiName: String? = null
    val currentHomePage: HomePageResponse? = null
    private val `homeViewModel$delegate`: Lazy<*>
    var toggleRandomButton = false

    @Override // com.phimhd.BaseFragment
    override fun `_$_clearFindViewByIdCache`() {
        `_$_findViewCache`.clear()
    }

    @Override // com.phimhd.BaseFragment
    override fun `_$_findCachedViewById`(i: Int): View {
        var findViewById: View
        val map: Map<Integer, View> = `_$_findViewCache`
        val view: View? = map[Integer.valueOf(i)]
        if (view == null) {
            val view2: View = getView()
            if (view2 == null || view2.findViewById(i).also { findViewById = it } == null) {
                return null
            }
            map.put(Integer.valueOf(i), findViewById)
            return findViewById
        }
        return view
    }

    @Override // com.phimhd.BaseFragment, androidx.fragment.app.Fragment
    /* synthetic */  override fun onDestroyView() {
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    /* compiled from: HomeFragment.kt */
    @Metadata(
        m108d1 = ["\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\\\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00100\u00170\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018J\u0012\u0010 \u001a\u00020!*\u00020\"2\u0006\u0010#\u001a\u00020\$J(\u0010%\u001a\u00020!*\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020!0*R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u000cR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006+"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/home/HomeFragment\$Companion;", "", "()V", "configEvent", "Lcom/lagradost/cloudstream3/utils/Event;", "", "getConfigEvent", "()Lcom/lagradost/cloudstream3/utils/Event;", "currentSpan", "getCurrentSpan", "()I", "setCurrentSpan", "(I)V", "errorProfilePic", "getErrorProfilePic", "errorProfilePics", "", "listHomepageItems", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "getListHomepageItems", "()Ljava/util/List;", "getPairList", "Lkotlin/Pair;", "Lcom/google/android/material/button/MaterialButton;", "Lcom/lagradost/cloudstream3/TvType;", "anime", "cartoons", "tvs", "docs", "movies", "asian", "loadHomepageList", "", "Landroid/app/Activity;", "item", "Lcom/lagradost/cloudstream3/HomePageList;", "selectHomepage", "Landroid/content/Context;", "selectedApiName", "", "callback", "Lkotlin/Function1;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.home.HomeFragment$Companion */ /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        val configEvent: Event<Any>
            get() = HomeFragment.Companion.configEvent
        var currentSpan: Int
            get() = HomeFragment.Companion.currentSpan
            set(i) {
                HomeFragment.Companion.currentSpan = i
            }
        val listHomepageItems: List<Any>
            get() = HomeFragment.Companion.listHomepageItems
        val errorProfilePic: Int
            get() = HomeFragment.Companion.errorProfilePic

        fun loadHomepageList(activity: Activity?, item: HomePageList) {
            Intrinsics.checkNotNullParameter(activity, "<this>")
            Intrinsics.checkNotNullParameter(item, "item")
            val bottomSheetDialog = BottomSheetDialog(activity)
            bottomSheetDialog.setContentView(R.layout.home_episodes_expanded)
            val findViewById: View = bottomSheetDialog.findViewById<View>(R.id.home_expanded_text)
            Intrinsics.checkNotNull(findViewById)
            (findViewById as TextView).setText(item.name)
            val findViewById2: View =
                bottomSheetDialog.findViewById<View>(R.id.home_expanded_recycler)
            Intrinsics.checkNotNull(findViewById2)
            val autofitRecyclerView: AutofitRecyclerView = findViewById2 as AutofitRecyclerView
            val findViewById3: View =
                bottomSheetDialog.findViewById<View>(R.id.home_expanded_drag_down)
            Intrinsics.checkNotNull(findViewById3)
            (findViewById3 as FrameLayout).setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$HomeFragment$Companion$SCvk54ifWBarU-D1qr2eoIWil-8
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8639loadHomepageList$lambda0`(this@BottomSheetDialog, activity, view)
                }
            })
            autofitRecyclerView.setSpanCount(currentSpan)
            autofitRecyclerView.setAdapter(
                SearchAdaptor(
                    CollectionsKt.toMutableList(item.getList() as Collection),
                    autofitRecyclerView,
                    null,
                    `HomeFragment$Companion$loadHomepageList$2`(activity, bottomSheetDialog),
                    4,
                    null
                )
            )
            val `homeFragment$Companion$loadHomepageList$spanListener$1` =
                `HomeFragment$Companion$loadHomepageList$spanListener$1`(autofitRecyclerView)
            configEvent.plusAssign(`homeFragment$Companion$loadHomepageList$spanListener$1`)
            bottomSheetDialog.setOnDismissListener(object : OnDismissListener() {
                // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$HomeFragment$Companion$8EBRJe9bmoBQFhabLfsrO5-JLRA
                @Override // android.content.DialogInterface.OnDismissListener
                fun onDismiss(dialogInterface: DialogInterface?) {
                    `m8640loadHomepageList$lambda1`(this@Function1, dialogInterface)
                }
            })
            bottomSheetDialog.show()
        }

        fun getPairList(
            materialButton: MaterialButton?,
            materialButton2: MaterialButton?,
            materialButton3: MaterialButton?,
            materialButton4: MaterialButton?,
            materialButton5: MaterialButton?,
            materialButton6: MaterialButton?
        ): List<Tuples<MaterialButton, List<TvType>>> {
            return CollectionsKt.listOf<Object>(
                *arrayOf<Tuples<*, *>>(
                    Tuples<Any?, Any?>(
                        materialButton,
                        CollectionsKt.listOf<Object>(
                            *arrayOf<TvType>(
                                TvType.Anime,
                                TvType.OVA,
                                TvType.AnimeMovie
                            ) as Array<Object>
                        )
                    ),
                    Tuples<Any?, Any?>(
                        materialButton2,
                        CollectionsKt.listOf<TvType>(TvType.Cartoon)
                    ),
                    Tuples<Any?, Any?>(
                        materialButton3,
                        CollectionsKt.listOf<TvType>(TvType.TvSeries)
                    ),
                    Tuples<Any?, Any?>(
                        materialButton4,
                        CollectionsKt.listOf<TvType>(TvType.Documentary)
                    ),
                    Tuples<Any?, Any?>(
                        materialButton5,
                        CollectionsKt.listOf<Object>(
                            *arrayOf<TvType>(
                                TvType.Movie,
                                TvType.Torrent
                            ) as Array<Object>
                        )
                    ),
                    Tuples<Any?, Any?>(
                        materialButton6,
                        CollectionsKt.listOf<TvType>(TvType.AsianDrama)
                    )
                ) as Array<Object>
            )
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
            if (r3 != null) goto L32;
         */
        /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */ /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */ /* JADX WARN: Removed duplicated region for block: B:36:0x014b  */ /* JADX WARN: Removed duplicated region for block: B:40:0x0168  */ /* JADX WARN: Removed duplicated region for block: B:43:0x0171  */ /* JADX WARN: Removed duplicated region for block: B:45:0x0176  */ /* JADX WARN: Removed duplicated region for block: B:49:0x0188  */ /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List, T] */ /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        fun selectHomepage(
            r28: android.content.Context?,
            r29: String?,
            r30: Function1<String?, Unit>?
        ) {
            /*
                Method dump skipped, instructions count: 647
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.home.HomeFragment.Companion.selectHomepage(android.content.Context, java.lang.String, kotlin.jvm.functions.Function1):void")
        }

        companion object {
            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: loadHomepageList$lambda-0  reason: not valid java name */
            fun `m8639loadHomepageList$lambda0`(
                bottomSheetDialogBuilder: BottomSheetDialog?,
                this_loadHomepageList: Activity?,
                view: View?
            ) {
                Intrinsics.checkNotNullParameter(
                    bottomSheetDialogBuilder,
                    "\$bottomSheetDialogBuilder"
                )
                Intrinsics.checkNotNullParameter(this_loadHomepageList, "\$this_loadHomepageList")
                UIHelper.INSTANCE.dismissSafe(bottomSheetDialogBuilder, this_loadHomepageList)
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: loadHomepageList$lambda-1  reason: not valid java name */
            fun `m8640loadHomepageList$lambda1`(
                spanListener: Function1<*, *>?,
                dialogInterface: DialogInterface?
            ) {
                Intrinsics.checkNotNullParameter(spanListener, "\$spanListener")
                Companion.getConfigEvent().minusAssign(spanListener)
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: selectHomepage$lambda-17$lambda-4  reason: not valid java name */
            fun `m8644selectHomepage$lambda17$lambda4`(dialog: BottomSheetDialog?, view: View?) {
                Intrinsics.checkNotNullParameter(dialog, "\$dialog")
                UIHelper.INSTANCE.dismissSafe(dialog)
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: selectHomepage$lambda-17$lambda-5  reason: not valid java name */
            fun `m8645selectHomepage$lambda17$lambda5`(
                currentApiName: ObjectRef<*>,
                str: String?,
                callback: Function1<*, *>,
                dialog: BottomSheetDialog?,
                view: View?
            ) {
                var str2: String?
                Intrinsics.checkNotNullParameter(currentApiName, "\$currentApiName")
                Intrinsics.checkNotNullParameter(callback, "\$callback")
                Intrinsics.checkNotNullParameter(dialog, "\$dialog")
                if (!Intrinsics.areEqual(
                        currentApiName.element,
                        str
                    ) && currentApiName.element as String?. also { str2 = it } != null
                ) {
                    callback.invoke(str2)
                }
                UIHelper.INSTANCE.dismissSafe(dialog)
            }

            /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */ /* renamed from: selectHomepage$lambda-17$lambda-6  reason: not valid java name */
            fun `m8646selectHomepage$lambda17$lambda6`(
                currentValidApis: ObjectRef<*>,
                currentApiName: ObjectRef<*>,
                callback: Function1<*, *>,
                dialog: BottomSheetDialog?,
                adapterView: AdapterView?,
                view: View?,
                i: Int,
                j: Long
            ) {
                Intrinsics.checkNotNullParameter(currentValidApis, "\$currentValidApis")
                Intrinsics.checkNotNullParameter(currentApiName, "\$currentApiName")
                Intrinsics.checkNotNullParameter(callback, "\$callback")
                Intrinsics.checkNotNullParameter(dialog, "\$dialog")
                if (!(currentValidApis.element as Collection).isEmpty()) {
                    currentApiName.element = (currentValidApis.element[i] as MainAPI).name
                    val str = currentApiName.element as String
                    if (str != null) {
                        callback.invoke(str)
                    }
                    UIHelper.INSTANCE.dismissSafe(dialog)
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
            if (r4 != false) goto L12;
         */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
            if (r3 != null) goto L37;
         */
            /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List, T] */ /* renamed from: selectHomepage$lambda-17$updateList  reason: not valid java name */ /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
            private fun `m8647selectHomepage$lambda17$updateList`(
                r6: android.content.Context,
                r7: List<TvType>,
                r8: android.widget.ArrayAdapter<String>,
                r9: ObjectRef<List<MainAPI>>,
                r10: List<MainAPI>,
                r11: ObjectRef<String>,
                r12: android.widget.ListView,
                r13: Boolean
            ) {
                /*
                Method dump skipped, instructions count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
                throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.home.HomeFragment.Companion.m8647selectHomepage\$lambda17\$updateList(android.content.Context, java.util.List, android.widget.ArrayAdapter, kotlin.jvm.internal.Ref\$ObjectRef, java.util.List, kotlin.jvm.internal.Ref\$ObjectRef, android.widget.ListView, boolean):void")
            }

            /* renamed from: selectHomepage$lambda-17$buttonContains  reason: not valid java name */
            private fun `m8641selectHomepage$lambda17$buttonContains`(
                list: List<TvType>,
                list2: List<TvType>
            ): Boolean {
                val list3: List<TvType> = list
                if (list3 is Collection && list3.isEmpty()) {
                    return false
                }
                for (tvType in list3) {
                    if (list2.contains(tvType)) {
                        return true
                    }
                }
                return false
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: selectHomepage$lambda-17$lambda-15  reason: not valid java name */
            fun `m8642selectHomepage$lambda17$lambda15`(
                preSelectedTypes: List,
                validTypes: List?,
                pairList: List,
                materialButton: MaterialButton,
                this_selectHomepage: Context,
                arrayAdapter: ArrayAdapter,
                currentValidApis: ObjectRef<*>,
                validAPIs: List,
                currentApiName: ObjectRef<*>,
                listView: ListView,
                z: Boolean,
                view: View?
            ) {
                Intrinsics.checkNotNullParameter(preSelectedTypes, "\$preSelectedTypes")
                Intrinsics.checkNotNullParameter(validTypes, "\$validTypes")
                Intrinsics.checkNotNullParameter(pairList, "\$pairList")
                Intrinsics.checkNotNullParameter(this_selectHomepage, "\$this_selectHomepage")
                Intrinsics.checkNotNullParameter(arrayAdapter, "\$arrayAdapter")
                Intrinsics.checkNotNullParameter(currentValidApis, "\$currentValidApis")
                Intrinsics.checkNotNullParameter(validAPIs, "\$validAPIs")
                Intrinsics.checkNotNullParameter(currentApiName, "\$currentApiName")
                preSelectedTypes.clear()
                preSelectedTypes.addAll(validTypes)
                val it: Iterator = pairList.iterator()
                while (it.hasNext()) {
                    val materialButton2: MaterialButton =
                        (it.next() as Tuples<*, *>).component1() as MaterialButton
                    if (materialButton2 != null) {
                        materialButton2.setSelected(false)
                    }
                }
                materialButton.setSelected(true)
                `m8647selectHomepage$lambda17$updateList`(
                    this_selectHomepage,
                    preSelectedTypes,
                    arrayAdapter,
                    currentValidApis,
                    validAPIs,
                    currentApiName,
                    listView,
                    z
                )
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: selectHomepage$lambda-17$lambda-16  reason: not valid java name */
            fun `m8643selectHomepage$lambda17$lambda16`(
                materialButton: MaterialButton,
                preSelectedTypes: List,
                validTypes: List,
                this_selectHomepage: Context,
                arrayAdapter: ArrayAdapter,
                currentValidApis: ObjectRef<*>,
                validAPIs: List,
                currentApiName: ObjectRef<*>,
                listView: ListView,
                z: Boolean,
                view: View?
            ): Boolean {
                Intrinsics.checkNotNullParameter(preSelectedTypes, "\$preSelectedTypes")
                Intrinsics.checkNotNullParameter(validTypes, "\$validTypes")
                Intrinsics.checkNotNullParameter(this_selectHomepage, "\$this_selectHomepage")
                Intrinsics.checkNotNullParameter(arrayAdapter, "\$arrayAdapter")
                Intrinsics.checkNotNullParameter(currentValidApis, "\$currentValidApis")
                Intrinsics.checkNotNullParameter(validAPIs, "\$validAPIs")
                Intrinsics.checkNotNullParameter(currentApiName, "\$currentApiName")
                if (!`m8641selectHomepage$lambda17$buttonContains`(preSelectedTypes, validTypes)) {
                    materialButton.setSelected(true)
                    preSelectedTypes.addAll(validTypes)
                } else {
                    materialButton.setSelected(false)
                    preSelectedTypes.removeAll(validTypes)
                }
                `m8647selectHomepage$lambda17$updateList`(
                    this_selectHomepage,
                    preSelectedTypes,
                    arrayAdapter,
                    currentValidApis,
                    validAPIs,
                    currentApiName,
                    listView,
                    z
                )
                return true
            }
        }
    }

    init {
        val homeFragment = this
        `homeViewModel$delegate` = FragmentViewModelLazy.createViewModelLazy<ViewModel>(
            homeFragment,
            Reflection.getOrCreateKotlinClass(
                HomeViewModel::class.java
            ),
            `HomeFragment$special$$inlined$activityViewModels$default$1`(homeFragment),
            `HomeFragment$special$$inlined$activityViewModels$default$2`(null, homeFragment),
            `HomeFragment$special$$inlined$activityViewModels$default$3`(homeFragment)
        )
    }

    /* JADX INFO: Access modifiers changed from: private */
    val homeViewModel: HomeViewModel
        get() = `homeViewModel$delegate`.value as HomeViewModel

    @Override // androidx.fragment.app.Fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        viewGroup: ViewGroup,
        bundle: Bundle
    ): View {
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        val context: Context = getContext()
        val z = true
        return inflater.inflate(
            if (context == null || !SettingsFragment.Companion.Companion.isTvSettings(
                    context
                )
            ) false else if (false) R.layout.fragment_home_tv else R.layout.fragment_home,
            viewGroup,
            false
        )
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun toggleMainVisibility(z: Boolean, bool: Boolean?) {
        val linearLayout: LinearLayout =
            `_$_findCachedViewById`(C4761R.C4764id.home_main_holder) as LinearLayout
        if (linearLayout != null) {
            linearLayout.setVisibility(if (z) 0 else 8)
        }
        val recyclerView: RecyclerView =
            `_$_findCachedViewById`(C4761R.C4764id.home_main_poster_recyclerview) as RecyclerView
                ?: return
        recyclerView.setVisibility(
            if (Intrinsics.areEqual(
                    bool as Object?,
                    true as Object
                )
            ) 0 else 8
        )
    }

    private fun fixGrid() {
        var spanCount: Integer
        val activity: FragmentActivity = getActivity()
        if (activity != null && UIHelper.INSTANCE.getSpanCount(activity)
                .also { spanCount = it } != null
        ) {
            Companion.currentSpan = spanCount.intValue()
        }
        Companion.configEvent.invoke(Integer.valueOf(Companion.currentSpan))
    }

    fun toPage(mainAPI: MainAPI): Page {
        Intrinsics.checkNotNullParameter(mainAPI, "<this>")
        return Page(mainAPI.name, mainAPI.mainUrl, false, mainAPI.name, null, 16, null)
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    override fun onConfigurationChanged(newConfig: Configuration) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig")
        super.onConfigurationChanged(newConfig)
        fixGrid()
    }

    @Override // com.phimhd.BaseFragment, androidx.fragment.app.Fragment
    override fun onResume() {
        super.onResume()
        reloadStored()
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun reloadStored() {
        homeViewModel.loadResumeWatching()
        val noneOf: EnumSet<WatchType?> = EnumSet.noneOf(WatchType::class.java)
        val context: Context = AcraApplication.Companion.context
        var obj: Object? = null
        if (context != null) {
            val dataStore: DataStore = DataStore.INSTANCE
            try {
                val string: String = dataStore.getSharedPrefs(context)
                    .getString(HomeFragmentKt.HOME_BOOKMARK_VALUE_LIST, null)
                if (string != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getSharedPrefs().getStri…h, null) ?: return defVal"
                    )
                    val readValue: Object = dataStore.mapper.readValue(string, IntArray::class.java)
                    Intrinsics.checkNotNullExpressionValue(
                        readValue,
                        "mapper.readValue(this, T::class.java)"
                    )
                    obj = readValue
                }
            } catch (unused: Exception) {
            }
        }
        val iArr = obj as IntArray?
        if (iArr != null) {
            val arrayList = ArrayList(iArr.size)
            for (i in iArr) {
                arrayList.add(WatchType.Companion.Companion.fromInternalId(Integer.valueOf(i)))
            }
            noneOf.addAll(arrayList)
        }
        homeViewModel.loadStoredData(noneOf)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun focusCallback(searchResponse: SearchResponse?) {
        val textView: TextView = `_$_findCachedViewById`(C4761R.C4764id.home_focus_text) as TextView
        if (textView != null) {
            textView.setText(searchResponse.name)
        }
        val imageView: ImageView =
            `_$_findCachedViewById`(C4761R.C4764id.home_blur_poster) as ImageView
        if (imageView != null) {
            UIHelper.`setImageBlur$default`(
                UIHelper.INSTANCE,
                imageView,
                searchResponse.posterUrl,
                50,
                10,
                null,
                8,
                null
            )
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun homeHandleSearch(searchClickCallback: SearchClickCallback) {
        if (searchClickCallback.getAction() == 4) {
            focusCallback(searchClickCallback.getCard())
        } else {
            SearchHelper.Companion.INSTANCE.handleSearchClickCallback(
                getActivity(),
                searchClickCallback
            )
        }
    }

    @Override // androidx.fragment.app.Fragment
    override fun onViewCreated(view: View, bundle: Bundle) {
        val str: String?
        var z: Boolean
        val obj: Object?
        val string: String
        var extendedFloatingActionButton: ExtendedFloatingActionButton
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        fixGrid()
        val imageView: ImageView =
            `_$_findCachedViewById`(C4761R.C4764id.home_change_api) as ImageView
        if (imageView != null) {
            imageView.setOnClickListener(apiChangeClickListener)
        }
        val imageView2: ImageView =
            `_$_findCachedViewById`(C4761R.C4764id.home_change_api_loading) as ImageView
        if (imageView2 != null) {
            imageView2.setOnClickListener(apiChangeClickListener)
        }
        val extendedFloatingActionButton2: ExtendedFloatingActionButton =
            `_$_findCachedViewById`(C4761R.C4764id.home_api_fab) as ExtendedFloatingActionButton
        if (extendedFloatingActionButton2 != null) {
            extendedFloatingActionButton2.setOnClickListener(apiChangeClickListener)
        }
        val extendedFloatingActionButton3: ExtendedFloatingActionButton =
            `_$_findCachedViewById`(C4761R.C4764id.home_random) as ExtendedFloatingActionButton
        if (extendedFloatingActionButton3 != null) {
            extendedFloatingActionButton3.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$HomeFragment$xeCOAlhORD77a1RMKFpon3thqZk
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8634onViewCreated$lambda6`(this@HomeFragment, view2)
                }
            })
        }
        val context: Context = getContext()
        if (context != null) {
            toggleRandomButton = PreferenceManager.getDefaultSharedPreferences(context)
                .getBoolean(getString(R.string.random_button_key), false)
            val home_random: ExtendedFloatingActionButton =
                `_$_findCachedViewById`(C4761R.C4764id.home_random) as ExtendedFloatingActionButton
            if (home_random != null) {
                Intrinsics.checkNotNullExpressionValue(home_random, "home_random")
                home_random.setVisibility(if (toggleRandomButton) 0 else 8)
            }
            if (!toggleRandomButton && `_$_findCachedViewById`(C4761R.C4764id.home_random) as ExtendedFloatingActionButton?. also {
                    extendedFloatingActionButton = it
                } != null) {
                extendedFloatingActionButton.setVisibility(8)
            }
        }
        val homeFragment = this
        ArchComponentExt.observe(
            homeFragment,
            homeViewModel.apiName,
            `HomeFragment$onViewCreated$3`(this)
        )
        ArchComponentExt.observe(
            homeFragment,
            homeViewModel.randomItems,
            `HomeFragment$onViewCreated$4`(this)
        )
        val searchView: SearchView =
            `_$_findCachedViewById`(C4761R.C4764id.home_search) as SearchView
        if (searchView != null) {
            searchView.setOnQueryTextListener(object : OnQueryTextListener {
                // from class: com.lagradost.cloudstream3.ui.home.HomeFragment$onViewCreated$5
                @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
                override fun onQueryTextChange(newText: String): Boolean {
                    Intrinsics.checkNotNullParameter(newText, "newText")
                    return true
                }

                @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
                override fun onQueryTextSubmit(query: String): Boolean {
                    Intrinsics.checkNotNullParameter(query, "query")
                    val companion: QuickSearchFragment.Companion =
                        QuickSearchFragment.Companion.Companion
                    val activity: FragmentActivity = this@HomeFragment.getActivity()
                    val currentApiName = currentApiName
                    companion.pushSearch(activity, query, currentApiName?.let { arrayOf(it) })
                    return true
                }
            })
        }
        ArchComponentExt.observe<Resource<HomePageResponse>>(
            homeFragment,
            homeViewModel.page,
            `HomeFragment$onViewCreated$6`(this)
        )
        val homeParentItemAdapter = HomeParentItemAdapter(
            ArrayList(),
            `HomeFragment$onViewCreated$adapter$1`(this),
            `HomeFragment$onViewCreated$adapter$2`(this)
        )
        val listOf: List<Tuples<*, *>> = CollectionsKt.listOf<Object>(
            *arrayOf<Tuples<*, *>>(
                Tuples(
                    `_$_findCachedViewById`(C4761R.C4764id.home_type_watching_btt) as MaterialButton,
                    WatchType.WATCHING
                ),
                Tuples(
                    `_$_findCachedViewById`(C4761R.C4764id.home_type_completed_btt) as MaterialButton,
                    WatchType.COMPLETED
                ),
                Tuples(
                    `_$_findCachedViewById`(C4761R.C4764id.home_type_dropped_btt) as MaterialButton,
                    WatchType.DROPPED
                ),
                Tuples(
                    `_$_findCachedViewById`(C4761R.C4764id.home_type_on_hold_btt) as MaterialButton,
                    WatchType.ONHOLD
                ),
                Tuples<Any?, Any?>(
                    `_$_findCachedViewById`(C4761R.C4764id.home_plan_to_watch_btt) as MaterialButton,
                    WatchType.PLANTOWATCH
                )
            ) as Array<Object>
        )
        for (tuples in listOf) {
            val watchType: WatchType = tuples.second as WatchType
            val materialButton: MaterialButton = tuples.first as MaterialButton
            if (materialButton != null) {
                materialButton.setOnClickListener(object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$HomeFragment$wwOlOSTu0Xw38tNe4WrLiE0Vmu0
                    @Override // android.view.View.OnClickListener
                    fun onClick(view2: View?) {
                        Companion.`m8635onViewCreated$lambda8`(this@HomeFragment, watchType, view2)
                    }
                })
            }
            val materialButton2: MaterialButton = tuples.first as MaterialButton
            if (materialButton2 != null) {
                materialButton2.setOnLongClickListener(object : OnLongClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$HomeFragment$PPdt45T7gC2VDq7MrEwyDehKibk
                    @Override // android.view.View.OnLongClickListener
                    fun onLongClick(view2: View?): Boolean {
                        val `m8632onViewCreated$lambda11`: Boolean
                        `m8632onViewCreated$lambda11` =
                            Companion.`m8632onViewCreated$lambda11`(this@WatchType, this, view2)
                        return `m8632onViewCreated$lambda11`
                    }
                })
            }
        }
        ArchComponentExt.observe<Tuples<EnumSet<WatchType>, EnumSet<WatchType>>>(
            homeFragment,
            homeViewModel.availableWatchStatusTypes,
            `HomeFragment$onViewCreated$9`(this, listOf)
        )
        ArchComponentExt.observe<Tuples<Boolean, List<SearchResponse>>>(
            homeFragment,
            homeViewModel.bookmarks,
            `HomeFragment$onViewCreated$10`(this)
        )
        ArchComponentExt.observe(
            homeFragment,
            homeViewModel.resumeWatching,
            `HomeFragment$onViewCreated$11`(this)
        )
        val recyclerView: RecyclerView =
            `_$_findCachedViewById`(C4761R.C4764id.home_bookmarked_child_recyclerview) as RecyclerView
        val arrayList = ArrayList()
        val recyclerView2: RecyclerView =
            `_$_findCachedViewById`(C4761R.C4764id.home_bookmarked_child_recyclerview) as RecyclerView
        val valueOf: Integer? =
            if (recyclerView2 != null) Integer.valueOf(recyclerView2.getNextFocusUpId()) else null
        val recyclerView3: RecyclerView =
            `_$_findCachedViewById`(C4761R.C4764id.home_bookmarked_child_recyclerview) as RecyclerView
        recyclerView.setAdapter(
            HomeChildItemAdapter(
                arrayList,
                Integer.valueOf(R.layout.home_result_circle_grid as Int),
                valueOf,
                if (recyclerView3 != null) Integer.valueOf(recyclerView3.getNextFocusDownId()) else null,
                `HomeFragment$onViewCreated$12`(this)
            )
        )
        val recyclerView4: RecyclerView =
            `_$_findCachedViewById`(C4761R.C4764id.home_watch_child_recyclerview) as RecyclerView
        if (recyclerView4 != null) {
            val arrayList2 = ArrayList()
            val recyclerView5: RecyclerView =
                `_$_findCachedViewById`(C4761R.C4764id.home_watch_child_recyclerview) as RecyclerView
            val valueOf2: Integer? =
                if (recyclerView5 != null) Integer.valueOf(recyclerView5.getNextFocusUpId()) else null
            val recyclerView6: RecyclerView =
                `_$_findCachedViewById`(C4761R.C4764id.home_watch_child_recyclerview) as RecyclerView
            recyclerView4.setAdapter(
                HomeChildItemAdapter(
                    arrayList2,
                    null,
                    valueOf2,
                    if (recyclerView6 != null) Integer.valueOf(recyclerView6.getNextFocusDownId()) else null,
                    `HomeFragment$onViewCreated$13`(this),
                    2,
                    null
                )
            )
        }
        (`_$_findCachedViewById`(C4761R.C4764id.home_master_recycler) as RecyclerView).setAdapter(
            homeParentItemAdapter
        )
        (`_$_findCachedViewById`(C4761R.C4764id.home_master_recycler) as RecyclerView).setLayoutManager(
            GridLayoutManager(getContext(), 1)
        )
        val context2: Context = getContext()
        if (if (context2 == null || SettingsFragment.Companion.Companion.isTvSettings(context2)) false else true) {
            LinearSnapHelper().attachToRecyclerView(`_$_findCachedViewById`(C4761R.C4764id.home_main_poster_recyclerview) as RecyclerView)
            val centerZoomLayoutManager = CenterZoomLayoutManager(getContext(), 0, false)
            centerZoomLayoutManager.setOnSizeListener(`HomeFragment$onViewCreated$14`(this))
            val recyclerView7: RecyclerView =
                `_$_findCachedViewById`(C4761R.C4764id.home_main_poster_recyclerview) as RecyclerView
            if (recyclerView7 != null) {
                recyclerView7.setLayoutManager(centerZoomLayoutManager)
            }
        }
        reloadStored()
        val context3: Context = getContext()
        if (context3 != null) {
            val dataStore: DataStore = DataStore.INSTANCE
            try {
                string =
                    dataStore.getSharedPrefs(context3).getString(DataStoreKt.HOMEPAGE_API, null)
            } catch (unused: Exception) {
            }
            if (string == null) {
                obj = null
                str = obj
            } else {
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getSharedPrefs().getStri…h, null) ?: return defVal"
                )
                obj = dataStore.mapper.readValue(string, String::class.java)
                Intrinsics.checkNotNullExpressionValue(obj, "mapper.readValue(this, T::class.java)")
                str = obj
            }
        } else {
            str = null
        }
        if (!Intrinsics.areEqual(homeViewModel.apiName.value, str) || str == null) {
            homeViewModel.loadAndCancel(str)
        }
        (`_$_findCachedViewById`(C4761R.C4764id.home_loaded) as NestedScrollView).setOnScrollChangeListener(
            object : OnScrollChangeListener {
                // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$HomeFragment$CrXWehQ1Amwcob1LjN_whiUNrW4
                @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                override fun onScrollChange(
                    nestedScrollView: NestedScrollView,
                    i: Int,
                    i2: Int,
                    i3: Int,
                    i4: Int
                ) {
                    Companion.`m8633onViewCreated$lambda12`(
                        this@HomeFragment,
                        nestedScrollView,
                        i,
                        i2,
                        i3,
                        i4
                    )
                }
            })
        val frameLayout: FrameLayout =
            `_$_findCachedViewById`(C4761R.C4764id.home_profile_picture_holder) as FrameLayout
        if (frameLayout != null) {
            frameLayout.setVisibility(8)
        }
        val context4: Context = getContext()
        if (context4 != null) {
            if (SettingsFragment.Companion.Companion.isTvSettings(context4)) {
                val home_api_fab: ExtendedFloatingActionButton =
                    `_$_findCachedViewById`(C4761R.C4764id.home_api_fab) as ExtendedFloatingActionButton
                if (home_api_fab != null) {
                    Intrinsics.checkNotNullExpressionValue(home_api_fab, "home_api_fab")
                    home_api_fab.setVisibility(8)
                }
                val home_change_api: ImageView =
                    `_$_findCachedViewById`(C4761R.C4764id.home_change_api) as ImageView
                if (home_change_api != null) {
                    Intrinsics.checkNotNullExpressionValue(home_change_api, "home_change_api")
                    home_change_api.setVisibility(0)
                }
                if (SettingsFragment.Companion.Companion.isTrueTvSettings(context4)) {
                    val home_change_api_loading: ImageView =
                        `_$_findCachedViewById`(C4761R.C4764id.home_change_api_loading) as ImageView
                    if (home_change_api_loading != null) {
                        Intrinsics.checkNotNullExpressionValue(
                            home_change_api_loading,
                            "home_change_api_loading"
                        )
                        home_change_api_loading.setVisibility(0)
                    }
                    val imageView3: ImageView =
                        `_$_findCachedViewById`(C4761R.C4764id.home_change_api_loading) as ImageView
                    if (imageView3 != null) {
                        imageView3.setFocusable(true)
                    }
                    val imageView4: ImageView =
                        `_$_findCachedViewById`(C4761R.C4764id.home_change_api_loading) as ImageView
                    if (imageView4 != null) {
                        imageView4.setFocusableInTouchMode(true)
                    }
                    val imageView5: ImageView =
                        `_$_findCachedViewById`(C4761R.C4764id.home_change_api) as ImageView
                    if (imageView5 != null) {
                        imageView5.setFocusable(true)
                    }
                    val imageView6: ImageView =
                        `_$_findCachedViewById`(C4761R.C4764id.home_change_api) as ImageView
                    if (imageView6 != null) {
                        imageView6.setFocusableInTouchMode(true)
                    }
                }
            } else {
                val home_api_fab2: ExtendedFloatingActionButton =
                    `_$_findCachedViewById`(C4761R.C4764id.home_api_fab) as ExtendedFloatingActionButton
                if (home_api_fab2 != null) {
                    Intrinsics.checkNotNullExpressionValue(home_api_fab2, "home_api_fab")
                    home_api_fab2.setVisibility(0)
                }
                val home_change_api2: ImageView =
                    `_$_findCachedViewById`(C4761R.C4764id.home_change_api) as ImageView
                if (home_change_api2 != null) {
                    Intrinsics.checkNotNullExpressionValue(home_change_api2, "home_change_api")
                    home_change_api2.setVisibility(8)
                }
                val home_change_api_loading2: ImageView =
                    `_$_findCachedViewById`(C4761R.C4764id.home_change_api_loading) as ImageView
                if (home_change_api_loading2 != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        home_change_api_loading2,
                        "home_change_api_loading"
                    )
                    home_change_api_loading2.setVisibility(8)
                }
            }
            val it: Iterator<OAuth2API> = AccountManager.Companion.oAuth2Apis.iterator()
            while (true) {
                if (!it.hasNext()) {
                    break
                }
                val loginInfo: LoginInfo = it.next().loginInfo()
                val profilePicture: String? =
                    if (loginInfo != null) loginInfo.profilePicture else null
                val imageView7: ImageView =
                    `_$_findCachedViewById`(C4761R.C4764id.home_profile_picture) as ImageView
                if (imageView7 == null || !UIHelper.`setImage$default`(
                        UIHelper.INSTANCE, imageView7, profilePicture, null, Integer.valueOf(
                            Companion.errorProfilePic
                        ), 2, null
                    )
                ) {
                    z = false
                    continue
                } else {
                    z = true
                    continue
                }
                if (z) {
                    val home_profile_picture_holder: FrameLayout =
                        `_$_findCachedViewById`(C4761R.C4764id.home_profile_picture_holder) as FrameLayout
                    if (home_profile_picture_holder != null) {
                        Intrinsics.checkNotNullExpressionValue(
                            home_profile_picture_holder,
                            "home_profile_picture_holder"
                        )
                        home_profile_picture_holder.setVisibility(0)
                    }
                }
            }
        }
        setUpHomeScreenWithPhimHD(this)
    }

    companion object {
        private const val errorProfilePic = 0
        private val errorProfilePics: List<Integer>? = null
        val Companion = Companion(null)
        private val configEvent: Event<Integer> = Event<Integer>()
        private const val currentSpan = 1
        private val listHomepageItems: List<SearchResponse> = ArrayList()

        init {
            val listOf: List<Integer> = CollectionsKt.listOf<Object>(
                *arrayOf<Integer>(
                    Integer.valueOf(R.drawable.monke_benene as Int),
                    Integer.valueOf(R.drawable.monke_burrito as Int),
                    Integer.valueOf(R.drawable.monke_coco as Int),
                    Integer.valueOf(R.drawable.monke_cookie as Int),
                    Integer.valueOf(R.drawable.monke_flusdered as Int),
                    Integer.valueOf(R.drawable.monke_funny as Int),
                    Integer.valueOf(R.drawable.monke_like as Int),
                    Integer.valueOf(R.drawable.monke_party as Int),
                    Integer.valueOf(R.drawable.monke_sob as Int),
                    Integer.valueOf(R.drawable.monke_drink as Int)
                ) as Array<Object>
            )
            HomeFragment.Companion.errorProfilePics = com.lagradost.cloudstream3.p041ui.home.listOf
            HomeFragment.Companion.errorProfilePic = (CollectionsKt.random(
                com.lagradost.cloudstream3.p041ui.home.listOf,
                Random.Default
            ) as Number).intValue()
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        fun  /* synthetic */`toggleMainVisibility$default`(
            homeFragment: HomeFragment,
            z: Boolean,
            bool: Boolean?,
            i: Int,
            obj: Object?
        ) {
            var bool = bool
            if (i and 2 != 0) {
                bool = true
            }
            homeFragment.toggleMainVisibility(z, bool)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: apiChangeClickListener$lambda-3  reason: not valid java name */
        fun `m8630apiChangeClickListener$lambda3`(`this$0`: HomeFragment, view: View) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val context: Context = `this$0`.getContext()
            if (context != null && SettingsFragment.Companion.Companion.isTrueTvSettings(context)) {
                val companion: Companion = Companion
                val context2: Context = view.getContext()
                Intrinsics.checkNotNullExpressionValue(context2, "view.context")
                companion.selectHomepage(
                    context2,
                    `this$0`.currentApiName,
                    `HomeFragment$apiChangeClickListener$1$1`(`this$0`)
                )
                return
            }
            val aPIHolder: APIHolder = APIHolder.INSTANCE
            val context3: Context = view.getContext()
            Intrinsics.checkNotNullExpressionValue(context3, "view.context")
            val mutableList: List<MainAPI> = CollectionsKt.toMutableList(
                APIHolder.`filterProviderByPreferredMedia$default`(
                    aPIHolder,
                    context3,
                    false,
                    1,
                    null
                ) as Collection
            )
            val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10))
            for (mainAPI in mutableList) {
                arrayList.add(`this$0`.toPage(mainAPI))
            }
            val arrayList2: ArrayList = arrayList
            val iCallbackDialogFilter: ICallbackDialogFilter = `this$0`.getICallbackDialogFilter()
            if (iCallbackDialogFilter != null) {
                iCallbackDialogFilter.showDialogFilter(arrayList2, object : ICallback<Any?> {
                    // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$HomeFragment$zVFmis8TbZUYxJ5mI7HZqjJPiqI
                    @Override // com.lagradost.cloudstream3.p041ui.browser.ICallback
                    override fun onCallback(obj: Object) {
                        HomeFragment.Companion.`m8631apiChangeClickListener$lambda3$lambda2`(
                            this@HomeFragment,
                            obj as Page
                        )
                    }
                })
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: apiChangeClickListener$lambda-3$lambda-2  reason: not valid java name */
        fun `m8631apiChangeClickListener$lambda3$lambda2`(`this$0`: HomeFragment, page: Page) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Log.d("Blue", "Page " + page.name + ' ' + page.getUrl())
            `this$0`.homeViewModel.loadAndCancel(page.name)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-6  reason: not valid java name */
        fun `m8634onViewCreated$lambda6`(`this$0`: HomeFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val list: List<SearchResponse> = HomeFragment.Companion.listHomepageItems
            if (!list.isEmpty()) {
                AppUtils.`loadSearchResult$default`(
                    AppUtils.INSTANCE,
                    `this$0`.getActivity(),
                    CollectionsKt.random(list, Random.Default) as SearchResponse?,
                    0,
                    null,
                    6,
                    null
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-8  reason: not valid java name */
        fun `m8635onViewCreated$lambda8`(`this$0`: HomeFragment, watch: WatchType?, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(watch, "\$watch")
            `this$0`.homeViewModel.loadStoredData(EnumSet.of(watch))
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-11  reason: not valid java name */
        fun `m8632onViewCreated$lambda11`(
            watch: WatchType?,
            `this$0`: HomeFragment,
            view: View
        ): Boolean {
            Intrinsics.checkNotNullParameter(watch, "\$watch")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val noneOf: EnumSet<WatchType?> = EnumSet.noneOf(WatchType::class.java)
            val dataStore: DataStore = DataStore.INSTANCE
            val context: Context = view.getContext()
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context")
            var obj: Object? = null
            try {
                val string: String = dataStore.getSharedPrefs(context)
                    .getString(HomeFragmentKt.HOME_BOOKMARK_VALUE_LIST, null)
                if (string != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getSharedPrefs().getStri…h, null) ?: return defVal"
                    )
                    val readValue: Object = dataStore.mapper.readValue(string, IntArray::class.java)
                    Intrinsics.checkNotNullExpressionValue(
                        readValue,
                        "mapper.readValue(this, T::class.java)"
                    )
                    obj = readValue
                }
            } catch (unused: Exception) {
            }
            val iArr = obj as IntArray?
            if (iArr != null) {
                val arrayList = ArrayList(iArr.size)
                for (i in iArr) {
                    arrayList.add(WatchType.Companion.Companion.fromInternalId(Integer.valueOf(i)))
                }
                noneOf.addAll(arrayList)
            }
            if (noneOf.contains(watch)) {
                noneOf.remove(watch)
            } else {
                noneOf.add(watch)
            }
            `this$0`.homeViewModel.loadStoredData(noneOf)
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-12  reason: not valid java name */
        fun `m8633onViewCreated$lambda12`(
            `this$0`: HomeFragment,
            view: NestedScrollView,
            i: Int,
            i2: Int,
            i3: Int,
            i4: Int
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(view, "view")
            val i5 = i2 - i4
            if (i5 > 0) {
                val extendedFloatingActionButton: ExtendedFloatingActionButton =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_api_fab) as ExtendedFloatingActionButton
                if (extendedFloatingActionButton != null) {
                    extendedFloatingActionButton.shrink()
                }
                val extendedFloatingActionButton2: ExtendedFloatingActionButton =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_random) as ExtendedFloatingActionButton
                if (extendedFloatingActionButton2 != null) {
                    extendedFloatingActionButton2.shrink()
                }
            } else if (i5 < -5) {
                val context: Context = view.getContext()
                var z = false
                if (context != null && !SettingsFragment.Companion.Companion.isTvSettings(context)) {
                    z = true
                }
                if (z) {
                    val extendedFloatingActionButton3: ExtendedFloatingActionButton =
                        `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_api_fab) as ExtendedFloatingActionButton
                    if (extendedFloatingActionButton3 != null) {
                        extendedFloatingActionButton3.extend()
                    }
                    val extendedFloatingActionButton4: ExtendedFloatingActionButton =
                        `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_random) as ExtendedFloatingActionButton
                    if (extendedFloatingActionButton4 != null) {
                        extendedFloatingActionButton4.extend()
                    }
                }
            }
        }
    }
}