package com.lagradost.cloudstream3.p041ui.browser

import android.app.Activity
import androidx.fragment.app.Fragment
import com.lagradost.cloudstream3.mvvm.Resource
import org.jsoup.nodes.Element
import kotlin.jvm.internal.Intrinsics

/* compiled from: SubtitleBrowserFragment.kt */
@Metadata(
    m108d1 = ["\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016J\u001a\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0015\u0010\u000c\u001a\u00020\r*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/browser/SubtitleBrowserFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "elementDownloadLink", "Lorg/jsoup/nodes/Element;", "iCallback", "Lcom/lagradost/cloudstream3/ui/browser/ICallback;", "", "shareViewModel", "Lcom/lagradost/cloudstream3/ui/player/PlayerGeneratorViewModel;", "viewModel", "Lcom/lagradost/cloudstream3/ui/browser/SubtitleBrowserViewModel;", "windowHeight", "", "Landroidx/fragment/app/Fragment;", "getWindowHeight", "(Landroidx/fragment/app/Fragment;)I", "downloadSub", "", "getUrlDownload", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "parseHtmlAndDownload", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.browser.SubtitleBrowserFragment */ /* loaded from: classes.dex */
class SubtitleBrowserFragment constructor() : BottomSheetDialogFragment() {
    private var elementDownloadLink: Element? = null
    private val shareViewModel: PlayerGeneratorViewModel? = null
    private var viewModel: SubtitleBrowserViewModel? = null
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    private val iCallback: ICallback<String> = object : ICallback<Any?> {
        // from class: com.lagradost.cloudstream3.ui.browser.-$$Lambda$SubtitleBrowserFragment$BmqrtJEKJUxpZXqEUs_Hhh2aURI
        @Override // com.lagradost.cloudstream3.p041ui.browser.ICallback
        public override fun onCallback(obj: Object?) {
            Companion.`m8615iCallback$lambda1`(this@SubtitleBrowserFragment, obj as String?)
        }
    }

    fun `_$_clearFindViewByIdCache`() {
        `_$_findViewCache`.clear()
    }

    fun `_$_findCachedViewById`(i: Int): View? {
        var findViewById: View?
        val map: Map<Integer, View> = `_$_findViewCache`
        val view: View? = map.get(Integer.valueOf(i))
        if (view == null) {
            val view2: View? = getView()
            if (view2 == null || (view2.findViewById(i).also({ findViewById = it })) == null) {
                return null
            }
            map.put(Integer.valueOf(i), findViewById)
            return findViewById
        }
        return view
    }

    /* compiled from: SubtitleBrowserFragment.kt */
    @Metadata(
        m108d1 = ["\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\tj\b\u0012\u0004\u0012\u00020\u0004`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR-\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000ej\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/browser/SubtitleBrowserFragment\$Companion;", "", "()V", "DOMAIN_OPENSUBTITLE", "", "DOMAIN_PHUDEVIET", "DOMAIN_SUBSCENE", "DOMAIN_YTS", "listDomain", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getListDomain", "()Ljava/util/ArrayList;", "pairDomainWithQueryJsoup", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getPairDomainWithQueryJsoup", "()Ljava/util/HashMap;", "newInstance", "Lcom/lagradost/cloudstream3/ui/browser/SubtitleBrowserFragment;", "nameMovie", "pushSearch", "", "activity", "Landroid/app/Activity;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.browser.SubtitleBrowserFragment$Companion */ /* loaded from: classes.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        fun pushSearch(activity: Activity?) {
            val uIHelper: UIHelper = UIHelper.INSTANCE
            val bundle: Bundle = Bundle()
            val unit: Unit = Unit.INSTANCE
            uIHelper.navigate(activity, R.id.global_to_navigation_subtitle_browser, bundle)
        }

        fun newInstance(str: String?): SubtitleBrowserFragment {
            val bundle: Bundle = Bundle()
            if (str != null) {
                bundle.putString("nameMovie", str)
            }
            val subtitleBrowserFragment: SubtitleBrowserFragment = SubtitleBrowserFragment()
            subtitleBrowserFragment.setArguments(bundle)
            return subtitleBrowserFragment
        }

        val pairDomainWithQueryJsoup: HashMap<String, String>
            get() {
                return SubtitleBrowserFragment.Companion.pairDomainWithQueryJsoup
            }
        val listDomain: ArrayList<String>
            get() {
                return SubtitleBrowserFragment.Companion.listDomain
            }

        companion object {
            fun  /* synthetic */`newInstance$default`(
                companion: SubtitleBrowserFragment.Companion,
                str: String?,
                i: Int,
                obj: Object?
            ): SubtitleBrowserFragment {
                var str: String? = str
                if ((i and 1) != 0) {
                    str = null
                }
                return companion.newInstance(str)
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onCreateView(
        inflater: LayoutInflater,
        viewGroup: ViewGroup,
        bundle: Bundle
    ): View {
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        return inflater.inflate(R.layout.fragment_subtitle_browser, viewGroup, false)
    }

    fun getWindowHeight(fragment: Fragment): Int {
        Intrinsics.checkNotNullParameter(fragment, "<this>")
        if (Build.VERSION.SDK_INT >= 30) {
            val currentWindowMetrics: WindowMetrics =
                fragment.requireActivity().getWindowManager().getCurrentWindowMetrics()
            Intrinsics.checkNotNullExpressionValue(
                currentWindowMetrics,
                "requireActivity().window…ager.currentWindowMetrics"
            )
            val insets: Insets =
                currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.systemBars())
            Intrinsics.checkNotNullExpressionValue(
                insets,
                "metrics.windowInsets.get…Insets.Type.systemBars())"
            )
            return (currentWindowMetrics.getBounds().height() - insets.top) - insets.bottom
        }
        val displayMetrics: DisplayMetrics = DisplayMetrics()
        fragment.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics)
        return displayMetrics.heightPixels
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onViewCreated(view: View, bundle: Bundle) {
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        val layoutParams: ViewGroup.LayoutParams =
            (`_$_findCachedViewById`(C4761R.C4764id.layoutRoot) as ConstraintLayout?).getLayoutParams()
        Intrinsics.checkNotNullExpressionValue(layoutParams, "layoutRoot.layoutParams")
        layoutParams.height = getWindowHeight(this)
        (`_$_findCachedViewById`(C4761R.C4764id.layoutRoot) as ConstraintLayout?).setLayoutParams(
            layoutParams
        )
        val parent: ViewParent = view.getParent()
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View")
        val from: BottomSheetBehavior<*> = BottomSheetBehavior.from<View>(parent as View?)
        Intrinsics.checkNotNullExpressionValue(from, "from(view.parent as View)")
        from.setHideable(false)
        from.setBottomSheetCallback(object : BottomSheetCallback() {
            // from class: com.lagradost.cloudstream3.ui.browser.SubtitleBrowserFragment$onViewCreated$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public override fun onStateChanged(bottomSheet: View, i: Int) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet")
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public override fun onSlide(bottomSheet: View, f: Float) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet")
                from.setState(3)
            }
        })
        val hashMap: HashMap<String, String> = Companion.pairDomainWithQueryJsoup
        hashMap.put(Companion.DOMAIN_SUBSCENE, "#downloadButton")
        hashMap.put(Companion.DOMAIN_PHUDEVIET, ".info > a")
        hashMap.put(Companion.DOMAIN_YTS, ".btn-icon")
        hashMap.put(Companion.DOMAIN_OPENSUBTITLE, "#bt-dwl-bt")
        val context: Context? = getContext()
        if (context != null) {
            val arrayAdapter: ArrayAdapter = ArrayAdapter(context, 17367049, Companion.listDomain)
            arrayAdapter.setDropDownViewResource(17367049)
            (`_$_findCachedViewById`(C4761R.C4764id.spinner) as Spinner?).setAdapter(arrayAdapter as SpinnerAdapter?)
        }
        val spinner: Spinner? = `_$_findCachedViewById`(C4761R.C4764id.spinner) as Spinner?
        if (spinner != null) {
            spinner.setOnItemSelectedListener(object : OnItemSelectedListener() {
                // from class: com.lagradost.cloudstream3.ui.browser.SubtitleBrowserFragment$onViewCreated$3
                @Override // android.widget.AdapterView.OnItemSelectedListener
                fun onNothingSelected(adapterView: AdapterView<*>?) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                fun onItemSelected(adapterView: AdapterView<*>?, view2: View?, i: Int, j: Long) {
                    val str: String = Companion.Companion.getListDomain().get(i)
                    Intrinsics.checkNotNullExpressionValue(str, "listDomain[position]")
                    (`_$_findCachedViewById`(C4761R.C4764id.webview) as WebView?).loadUrl(str)
                }
            })
        }
        viewModel = ViewModelProvider(this).get(SubtitleBrowserViewModel::class.java)
        (`_$_findCachedViewById`(C4761R.C4764id.btnBack) as ImageView?).setOnClickListener(object :
            OnClickListener() {
            // from class: com.lagradost.cloudstream3.ui.browser.-$$Lambda$SubtitleBrowserFragment$_fuv7rMRRCCiLlNoWws7Fofxpmc
            @Override // android.view.View.OnClickListener
            fun onClick(view2: View?) {
                Companion.`m8617onViewCreated$lambda3`(this@SubtitleBrowserFragment, view2)
            }
        })
        (`_$_findCachedViewById`(C4761R.C4764id.btnBack) as ImageView?).setOnLongClickListener(
            object : OnLongClickListener() {
                // from class: com.lagradost.cloudstream3.ui.browser.-$$Lambda$SubtitleBrowserFragment$MkCa7JZvgClQh_BwACfIQZOs6K8
                @Override // android.view.View.OnLongClickListener
                fun onLongClick(view2: View?): Boolean {
                    val `m8618onViewCreated$lambda4`: Boolean
                    `m8618onViewCreated$lambda4` =
                        Companion.`m8618onViewCreated$lambda4`(this@SubtitleBrowserFragment, view2)
                    return `m8618onViewCreated$lambda4`
                }
            })
        (`_$_findCachedViewById`(C4761R.C4764id.tvDownload) as TextView?).setOnClickListener(object :
            OnClickListener() {
            // from class: com.lagradost.cloudstream3.ui.browser.-$$Lambda$SubtitleBrowserFragment$-vI7d2t1YXKsJx_oyiwy92-F8CQ
            @Override // android.view.View.OnClickListener
            fun onClick(view2: View?) {
                Companion.`m8619onViewCreated$lambda5`(this@SubtitleBrowserFragment, view2)
            }
        })
        (`_$_findCachedViewById`(C4761R.C4764id.btnMore) as ImageView?).setOnClickListener(object :
            OnClickListener() {
            // from class: com.lagradost.cloudstream3.ui.browser.-$$Lambda$SubtitleBrowserFragment$g6pz0MmNQLzza2_KpnAuOkUUg0w
            @Override // android.view.View.OnClickListener
            fun onClick(view2: View?) {
                Companion.`m8620onViewCreated$lambda6`(this@SubtitleBrowserFragment, view2)
            }
        })
        (`_$_findCachedViewById`(C4761R.C4764id.webview) as WebView?).getSettings()
            .setJavaScriptEnabled(true)
        (`_$_findCachedViewById`(C4761R.C4764id.webview) as WebView?).addJavascriptInterface(
            JavaScriptInterface(
                iCallback
            ), "HTMLOUT"
        )
        (`_$_findCachedViewById`(C4761R.C4764id.webview) as WebView?).setWebViewClient(object :
            WebViewClient() {
            // from class: com.lagradost.cloudstream3.ui.browser.SubtitleBrowserFragment$onViewCreated$8
            @Override // android.webkit.WebViewClient
            fun shouldOverrideUrlLoading(view2: WebView?, request: WebResourceRequest): Boolean {
                val element: Element?
                val urlDownload: String
                Intrinsics.checkNotNullParameter(view2, "view")
                Intrinsics.checkNotNullParameter(request, "request")
                Log.d("DuongKK", " onPageFinished " + request.getUrl())
                val uri: String = request.getUrl().toString()
                Intrinsics.checkNotNullExpressionValue(uri, "request.url.toString()")
                element = elementDownloadLink
                if (element != null) {
                    val subtitleBrowserFragment: SubtitleBrowserFragment =
                        this@SubtitleBrowserFragment
                    urlDownload = subtitleBrowserFragment.getUrlDownload(element)
                    if (Intrinsics.areEqual(urlDownload, uri)) {
                        subtitleBrowserFragment.downloadSub()
                        return false
                    }
                    return false
                }
                return false
            }

            @Override // android.webkit.WebViewClient
            fun onPageFinished(view2: WebView?, url: String) {
                Intrinsics.checkNotNullParameter(view2, "view")
                Intrinsics.checkNotNullParameter(url, "url")
                Log.d("DuongKK", "onPageFinished " + url)
                val progressBar: ProgressBar? =
                    `_$_findCachedViewById`(C4761R.C4764id.loading) as ProgressBar?
                if (progressBar != null) {
                    progressBar.setVisibility(8)
                }
                val textView: TextView? =
                    `_$_findCachedViewById`(C4761R.C4764id.tvTitle) as TextView?
                if (textView != null) {
                    textView.setText(url)
                }
                parseHtmlAndDownload()
            }

            @Override // android.webkit.WebViewClient
            fun onPageStarted(webView: WebView?, str: String?, bitmap: Bitmap?) {
                super.onPageStarted(webView, str, bitmap)
                val progressBar: ProgressBar? =
                    `_$_findCachedViewById`(C4761R.C4764id.loading) as ProgressBar?
                if (progressBar != null) {
                    progressBar.setVisibility(0)
                }
                val textView: TextView? =
                    `_$_findCachedViewById`(C4761R.C4764id.tvTitle) as TextView?
                if (textView != null) {
                    textView.setText(str)
                }
            }
        })
        (`_$_findCachedViewById`(C4761R.C4764id.webview) as WebView?).setWebChromeClient(object :
            WebChromeClient() {
            // from class: com.lagradost.cloudstream3.ui.browser.SubtitleBrowserFragment$onViewCreated$9
            @Override // android.webkit.WebChromeClient
            fun onProgressChanged(webView: WebView?, i: Int) {
                super.onProgressChanged(webView, i)
                val progressBar: ProgressBar? =
                    `_$_findCachedViewById`(C4761R.C4764id.loading) as ProgressBar?
                if (progressBar != null) {
                    progressBar.setIndeterminate(false)
                    progressBar.setMax(100)
                    progressBar.setProgress(i)
                    if (progressBar.getProgress() === 100) {
                        progressBar.setVisibility(8)
                    } else {
                        progressBar.setVisibility(0)
                    }
                }
            }
        })
        (`_$_findCachedViewById`(C4761R.C4764id.webview) as WebView?).loadUrl(Companion.DOMAIN_SUBSCENE)
        val subtitleBrowserFragment: SubtitleBrowserFragment = this
        var subtitleBrowserViewModel: SubtitleBrowserViewModel? = viewModel
        if (subtitleBrowserViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            subtitleBrowserViewModel = null
        }
        ArchComponentExt.observe<Resource<Object>>(
            subtitleBrowserFragment,
            subtitleBrowserViewModel.getResultResponse(),
            `SubtitleBrowserFragment$onViewCreated$10`(this)
        )
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun parseHtmlAndDownload() {
        val webView: WebView? = `_$_findCachedViewById`(C4761R.C4764id.webview) as WebView?
        if (webView != null) {
            webView.loadUrl("javascript:window.HTMLOUT.processHTML('<head>'+document.getElementsByTagName('html')[0].innerHTML+'</head>');")
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun getUrlDownload(element: Element): String {
        var href: String = element.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
        Intrinsics.checkNotNullExpressionValue(href, "href")
        if (!StringsKt.`contains$default`(
                href as CharSequence?,
                "http" as CharSequence?,
                false,
                2,
                null as Object?
            )
        ) {
            val sb: StringBuilder = StringBuilder()
            val selectedItem: Object =
                (`_$_findCachedViewById`(C4761R.C4764id.spinner) as Spinner?).getSelectedItem()
            Objects.requireNonNull(
                selectedItem,
                "null cannot be cast to non-null type kotlin.String"
            )
            sb.append(selectedItem as String?)
            sb.append(href)
            href = sb.toString()
        }
        Intrinsics.checkNotNullExpressionValue(href, "href")
        return href
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun downloadSub() {
        var externalFilesDir: File
        val element: Element? = elementDownloadLink
        if (element != null) {
            val urlDownload: String = getUrlDownload(element)
            val context: Context? = getContext()
            var subtitleBrowserViewModel: SubtitleBrowserViewModel? = null
            val absolutePath: String? = if ((context == null || (context.getExternalFilesDir(null)
                    .also({ externalFilesDir = it })) == null)
            ) null else externalFilesDir.getAbsolutePath()
            if (absolutePath != null) {
                Log.d("DuongKK", "URL SUB " + urlDownload + " to " + absolutePath)
                val subtitleBrowserViewModel2: SubtitleBrowserViewModel? = viewModel
                if (subtitleBrowserViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel")
                } else {
                    subtitleBrowserViewModel = subtitleBrowserViewModel2
                }
                subtitleBrowserViewModel!!.downloadSubtitle(urlDownload, absolutePath)
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public override fun onDestroyView() {
        var subtitleBrowserViewModel: SubtitleBrowserViewModel? = viewModel
        if (subtitleBrowserViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            subtitleBrowserViewModel = null
        }
        subtitleBrowserViewModel.getResultResponse().removeObservers(this)
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    companion object {
        val Companion: Companion = Companion(null)
        private val pairDomainWithQueryJsoup: HashMap<String, String> = HashMap()
        val DOMAIN_SUBSCENE: String = "https://subscene.com"
        val DOMAIN_PHUDEVIET: String = "http://phudeviet.org"
        val DOMAIN_YTS: String = "https://yts-subs.com"
        val DOMAIN_OPENSUBTITLE: String = "https://www.opensubtitles.org"
        private val listDomain: ArrayList<String> = CollectionsKt.arrayListOf<Any>(
            SubtitleBrowserFragment.Companion.DOMAIN_SUBSCENE,
            SubtitleBrowserFragment.Companion.DOMAIN_PHUDEVIET,
            SubtitleBrowserFragment.Companion.DOMAIN_YTS,
            SubtitleBrowserFragment.Companion.DOMAIN_OPENSUBTITLE
        )

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: iCallback$lambda-1  reason: not valid java name */
        fun `m8615iCallback$lambda1`(`this$0`: SubtitleBrowserFragment, str: String?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val parse: Document = Jsoup.parse(str)
            val selectedItem: Object =
                (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.spinner) as Spinner?).getSelectedItem()
            Objects.requireNonNull(
                selectedItem,
                "null cannot be cast to non-null type kotlin.String"
            )
            var str2: String? =
                SubtitleBrowserFragment.Companion.pairDomainWithQueryJsoup.get(selectedItem as String?)
            if (str2 == null) {
                str2 = "downloadButton"
            } else {
                Intrinsics.checkNotNullExpressionValue(
                    str2,
                    "pairDomainWithQueryJsoup[it]?:selectionQueryHtml"
                )
            }
            val selectFirst: Element? = parse.body().selectFirst(str2)
            if (selectFirst == null) {
                BuildersKt__Builders_commonKt.`launch$default`(
                    CoroutineScopeKt.CoroutineScope(
                        Dispatchers.getMain()
                    ), null, null, `SubtitleBrowserFragment$iCallback$1$3`(`this$0`, null), 3, null
                )
                return
            }
            Log.d("DuongKK", "element " + selectFirst.attr(ShareConstants.WEB_DIALOG_PARAM_HREF))
            BuildersKt__Builders_commonKt.`launch$default`(
                CoroutineScopeKt.CoroutineScope(
                    Dispatchers.getMain()
                ), null, null, `SubtitleBrowserFragment$iCallback$1$2`(`this$0`, null), 3, null
            )
            `this$0`.elementDownloadLink = selectFirst
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-3  reason: not valid java name */
        fun `m8617onViewCreated$lambda3`(`this$0`: SubtitleBrowserFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            KeyboardUtils.hideSoftInput(`this$0`.getActivity())
            if ((`this$0`.`_$_findCachedViewById`(C4761R.C4764id.webview) as WebView?).canGoBack()) {
                (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.webview) as WebView?).goBack()
                return
            }
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                UIHelper.INSTANCE.popCurrentPage(activity)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-4  reason: not valid java name */
        fun `m8618onViewCreated$lambda4`(`this$0`: SubtitleBrowserFragment, view: View?): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            KeyboardUtils.hideSoftInput(`this$0`.getActivity())
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                UIHelper.INSTANCE.popCurrentPage(activity)
                return true
            }
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-5  reason: not valid java name */
        fun `m8619onViewCreated$lambda5`(`this$0`: SubtitleBrowserFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val textView: TextView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.tvDownload) as TextView?
            if (textView != null) {
                textView.setVisibility(8)
            }
            `this$0`.downloadSub()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-6  reason: not valid java name */
        fun `m8620onViewCreated$lambda6`(`this$0`: SubtitleBrowserFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val intent: Intent = Intent("android.intent.action.VIEW")
            intent.setData(Uri.parse((`this$0`.`_$_findCachedViewById`(C4761R.C4764id.webview) as WebView?).getUrl()))
            try {
                `this$0`.startActivity(intent)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}