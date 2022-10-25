package com.lagradost.cloudstream3.p041ui.profile

import android.content.ActivityNotFoundException
import androidx.fragment.app.Fragment
import com.phimhd.Constants
import com.phimhd.Key
import kotlin.concurrent.Thread
import kotlin.jvm.internal.Intrinsics

/* compiled from: ProfileFragment.kt */
@Metadata(
    m108d1 = ["\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u001a\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006$"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/profile/ProfileFragment;", "Landroidx/fragment/app/Fragment;", "()V", "callbackManager", "Lcom/facebook/CallbackManager;", "getCallbackManager", "()Lcom/facebook/CallbackManager;", "setCallbackManager", "(Lcom/facebook/CallbackManager;)V", "receiver", "Landroid/content/BroadcastReceiver;", "shareDialog", "Lcom/facebook/share/widget/ShareDialog;", "getShareDialog", "()Lcom/facebook/share/widget/ShareDialog;", "setShareDialog", "(Lcom/facebook/share/widget/ShareDialog;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "", "onResume", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "parseKeyString", "", SDKConstants.PARAM_KEY, "Lcom/phimhd/Key;", "setOnClickView", "updateKey", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.profile.ProfileFragment */ /* loaded from: classes3.dex */
class ProfileFragment constructor() : Fragment() {
    private var callbackManager: CallbackManager? = null
    private var shareDialog: ShareDialog? = null
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    private val receiver: BroadcastReceiver = object : BroadcastReceiver() {
        // from class: com.lagradost.cloudstream3.ui.profile.ProfileFragment$receiver$1
        @Override // android.content.BroadcastReceiver
        fun onReceive(context: Context?, intent: Intent?) {
            Intrinsics.checkNotNullParameter(context, "context")
            Intrinsics.checkNotNullParameter(intent, "intent")
            updateKey()
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

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */  override fun onDestroyView() {
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    fun getCallbackManager(): CallbackManager? {
        return callbackManager
    }

    fun setCallbackManager(callbackManager: CallbackManager?) {
        this.callbackManager = callbackManager
    }

    fun getShareDialog(): ShareDialog? {
        return shareDialog
    }

    fun setShareDialog(shareDialog: ShareDialog?) {
        this.shareDialog = shareDialog
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onCreateView(
        inflater: LayoutInflater,
        viewGroup: ViewGroup,
        bundle: Bundle
    ): View {
        var window: Window
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        val activity: FragmentActivity? = getActivity()
        if (activity != null && (activity.getWindow().also({ window = it })) != null) {
            window.setSoftInputMode(4)
        }
        return inflater.inflate(R.layout.profile_fragment, viewGroup, false)
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onViewCreated(view: View, bundle: Bundle) {
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        callbackManager = CallbackManager.Factory.create()
        val shareDialog: ShareDialog = ShareDialog(this)
        this.shareDialog = shareDialog
        shareDialog.registerCallback(callbackManager, object : FacebookCallback<Sharer.Result?> {
            // from class: com.lagradost.cloudstream3.ui.profile.ProfileFragment$onViewCreated$1
            @Override // com.facebook.FacebookCallback
            public override fun onCancel() {
            }

            @Override // com.facebook.FacebookCallback
            public override fun onError(facebookException: FacebookException) {
            }

            @Override // com.facebook.FacebookCallback
            public override fun onSuccess(result: Sharer.Result) {
                val sb: StringBuilder = StringBuilder()
                sb.append("onSuccess = ")
                sb.append(if (result != null) result.getPostId() else null)
                LogUtils.m6080d(sb.toString(), arrayOfNulls<Object>(0))
            }
        })
        val calendar: Calendar = Calendar.getInstance()
        if (calendar.get(11) <= 12) {
            val stringCompanionObject: String.Companion = StringCompanionObject.INSTANCE
            val format: String = String.format(
                "Chào buổi sáng %s, Chúc bạn một ngày tốt lành!",
                Arrays.copyOf(arrayOf(""), 1)
            )
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)")
            (`_$_findCachedViewById`(C4761R.C4764id.tvGreeting) as TextView?).setText(format)
        } else if (calendar.get(11) <= 19 && calendar.get(11) > 12) {
            val stringCompanionObject2: String.Companion = StringCompanionObject.INSTANCE
            val format2: String = String.format(
                "Xin chào %s, Chúc bạn một ngày tốt lành!",
                Arrays.copyOf(arrayOf(""), 1)
            )
            Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)")
            (`_$_findCachedViewById`(C4761R.C4764id.tvGreeting) as TextView?).setText(format2)
        } else {
            val stringCompanionObject3: String.Companion = StringCompanionObject.INSTANCE
            val format3: String = String.format(
                "Xin chào %s, Ngày hôm nay của bạn thế nào?",
                Arrays.copyOf(arrayOf(""), 1)
            )
            Intrinsics.checkNotNullExpressionValue(format3, "format(format, *args)")
            (`_$_findCachedViewById`(C4761R.C4764id.tvGreeting) as TextView?).setText(format3)
        }
        (`_$_findCachedViewById`(C4761R.C4764id.textView18) as TextView?).setText("Phiên bản 5.6.84(84)")
        setOnClickView()
        updateKey()
    }

    private fun setOnClickView() {
        val textView: TextView? = `_$_findCachedViewById`(C4761R.C4764id.tvAdvance) as TextView?
        if (textView != null) {
            textView.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.profile.-$$Lambda$ProfileFragment$AcWv8bUrYnKFzR7uvIc8rE6lk3Q
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8741setOnClickView$lambda0`(this@ProfileFragment, view)
                }
            })
        }
        val textView2: TextView? = `_$_findCachedViewById`(C4761R.C4764id.tvPrivacy) as TextView?
        if (textView2 != null) {
            textView2.setOnClickListener(`$$Lambda$ProfileFragment$BACrI_ca3DrrqUPQpABFxnZKjGo`.Companion.INSTANCE)
        }
        val textView3: TextView? = `_$_findCachedViewById`(C4761R.C4764id.tvShare) as TextView?
        if (textView3 != null) {
            textView3.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.profile.-$$Lambda$ProfileFragment$IEcH__-lFLbVBZfKc2JieKqdLqo
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8743setOnClickView$lambda2`(this@ProfileFragment, view)
                }
            })
        }
        val textView4: TextView? = `_$_findCachedViewById`(C4761R.C4764id.tvFAQ) as TextView?
        if (textView4 != null) {
            textView4.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.profile.-$$Lambda$ProfileFragment$tKMIlF_8pEc2w3BxQfmasW3eoHo
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8744setOnClickView$lambda3`(this@ProfileFragment, view)
                }
            })
        }
        val textView5: TextView? = `_$_findCachedViewById`(C4761R.C4764id.tvContact) as TextView?
        if (textView5 != null) {
            textView5.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.profile.-$$Lambda$ProfileFragment$Tc1WaE-C1RQi3rosumMID7W3sOw
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8745setOnClickView$lambda4`(this@ProfileFragment, view)
                }
            })
        }
        val textView6: TextView? = `_$_findCachedViewById`(C4761R.C4764id.tvWebsite) as TextView?
        if (textView6 != null) {
            textView6.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.profile.-$$Lambda$ProfileFragment$5VVsE3qHokg7j4U8jpSCqLtUJ1U
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8746setOnClickView$lambda5`(this@ProfileFragment, view)
                }
            })
        }
        val textView7: TextView? = `_$_findCachedViewById`(C4761R.C4764id.textView14) as TextView?
        if (textView7 != null) {
            textView7.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.profile.-$$Lambda$ProfileFragment$aoKB4YDtIVcdYQgsSTAJExWVUnk
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8747setOnClickView$lambda6`(this@ProfileFragment, view)
                }
            })
        }
        val textView8: TextView? = `_$_findCachedViewById`(C4761R.C4764id.tvLevel) as TextView?
        if (textView8 != null) {
            textView8.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.profile.-$$Lambda$ProfileFragment$41QrrXk_D3W-4vYiAfkJcLyTBiY
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8748setOnClickView$lambda7`(this@ProfileFragment, view)
                }
            })
        }
        val textView9: TextView? = `_$_findCachedViewById`(C4761R.C4764id.tvDownload) as TextView?
        if (textView9 != null) {
            textView9.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.profile.-$$Lambda$ProfileFragment$6iWAygcAumq-PEpEO8vEsrm4y-E
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8749setOnClickView$lambda8`(this@ProfileFragment, view)
                }
            })
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun updateKey() {
        val companion: AppController? = AppController.Companion.getInstance()
        val key: Key? = if (companion != null) companion.getKey() else null
        if (key != null) {
            (`_$_findCachedViewById`(C4761R.C4764id.tvUsername) as TextView?).setText(
                parseKeyString(
                    key
                )
            )
            (`_$_findCachedViewById`(C4761R.C4764id.textView14) as TextView?).setText("Gia hạn")
            if (key.isExpired()) {
                (`_$_findCachedViewById`(C4761R.C4764id.textView13) as TextView?).setVisibility(0)
                (`_$_findCachedViewById`(C4761R.C4764id.textView14) as TextView?).setVisibility(0)
            } else {
                (`_$_findCachedViewById`(C4761R.C4764id.textView13) as TextView?).setVisibility(4)
                (`_$_findCachedViewById`(C4761R.C4764id.textView14) as TextView?).setVisibility(4)
            }
            if (key.expiredTime != -1L) {
                val date: Date = Date(key.expiredTime)
                val simpleDateFormat: SimpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
                val stringCompanionObject: String.Companion = StringCompanionObject.INSTANCE
                val format: String = String.format(
                    "Ngày hết hạn: %s",
                    Arrays.copyOf(arrayOf<Object>(simpleDateFormat.format(date)), 1)
                )
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)")
                (`_$_findCachedViewById`(C4761R.C4764id.textView13) as TextView?).setText(format)
                (`_$_findCachedViewById`(C4761R.C4764id.textView14) as TextView?).setText("Nâng cấp")
                (`_$_findCachedViewById`(C4761R.C4764id.textView13) as TextView?).setVisibility(0)
                (`_$_findCachedViewById`(C4761R.C4764id.textView14) as TextView?).setVisibility(0)
            } else {
                (`_$_findCachedViewById`(C4761R.C4764id.tvLevel) as TextView?).setText("Unlimited")
            }
        } else {
            (`_$_findCachedViewById`(C4761R.C4764id.tvLevel) as TextView?).setText("Chuẩn")
            (`_$_findCachedViewById`(C4761R.C4764id.textView14) as TextView?).setText("Nâng cấp")
            (`_$_findCachedViewById`(C4761R.C4764id.textView13) as TextView?).setText("Miễn phí")
        }
        (`_$_findCachedViewById`(C4761R.C4764id.swipe) as SwipeRefreshLayout?).setRefreshing(false)
    }

    private fun parseKeyString(key: Key): String {
        if (key.key.length() > 4) {
            val sb: StringBuilder = StringBuilder()
            sb.append("Mã kích hoạt: ****")
            val key2: String = key.key
            Intrinsics.checkNotNullExpressionValue(key2, "key.key")
            val substring: String = key2.substring(4)
            Intrinsics.checkNotNullExpressionValue(
                substring,
                "this as java.lang.String).substring(startIndex)"
            )
            sb.append(substring)
            return sb.toString()
        }
        return "Mã kích hoạt: " + key.key
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onPause() {
        val context: Context? = getContext()
        if (context != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(receiver)
        }
        super.onPause()
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onResume() {
        super.onResume()
        val intentFilter: IntentFilter = IntentFilter(Constants.INTENT_UPDATE_KEY)
        val context: Context? = getContext()
        if (context != null) {
            LocalBroadcastManager.getInstance(context).registerReceiver(receiver, intentFilter)
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setOnClickView$lambda-0  reason: not valid java name */
        fun `m8741setOnClickView$lambda0`(`this$0`: ProfileFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            SettingsFragment.Companion.Companion.push(`this$0`.getActivity())
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setOnClickView$lambda-1  reason: not valid java name */
        fun `m8742setOnClickView$lambda1`(view: View) {
            val builder: AlertDialog.Builder = AlertDialog.Builder(view.getContext())
            builder.setTitle(R.string.legal_notice)
            builder.setMessage(R.string.legal_notice_text)
            builder.show()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setOnClickView$lambda-2  reason: not valid java name */
        fun `m8743setOnClickView$lambda2`(`this$0`: ProfileFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            if (ShareDialog.canShow(ShareLinkContent::class.java as Class<out ShareContent<*, *>?>?)) {
                val build: ShareLinkContent = ShareLinkContent.Builder()
                    .setContentUrl(Uri.parse("https://play.google.com/store/apps/details?id=com.bongngotv2"))
                    .setShareHashtag(ShareHashtag.Builder().setHashtag("#phimhd").build())
                    .setQuote("BongNgoTV - Ở đây toàn phim hay").build()
                val shareDialog: ShareDialog? = `this$0`.shareDialog
                Intrinsics.checkNotNull(shareDialog)
                shareDialog.show(build)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setOnClickView$lambda-3  reason: not valid java name */
        fun `m8744setOnClickView$lambda3`(`this$0`: ProfileFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val intent: Intent = Intent(
                "android.intent.action.VIEW",
                Uri.parse("market://details?id=" + `this$0`.requireContext().getPackageName())
            )
            intent.addFlags(1208483840)
            try {
                `this$0`.startActivity(intent)
            } catch (unused: ActivityNotFoundException) {
                `this$0`.startActivity(
                    Intent(
                        "android.intent.action.VIEW",
                        Uri.parse(
                            "http://play.google.com/store/apps/details?id=" + `this$0`.requireContext()
                                .getPackageName()
                        )
                    )
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setOnClickView$lambda-4  reason: not valid java name */
        fun `m8745setOnClickView$lambda4`(`this$0`: ProfileFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val intent: Intent = Intent("android.intent.action.VIEW")
            intent.setData(Uri.parse(Constants.URL_PAGE))
            `this$0`.startActivity(intent)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setOnClickView$lambda-5  reason: not valid java name */
        fun `m8746setOnClickView$lambda5`(`this$0`: ProfileFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Thread.thread(
                (r12 and 1) !== 0,
                if ((r12 and 2) !== 0) false else false,
                if ((r12 and 4) !== 0) null else null,
                if ((r12 and 8) !== 0) null else null,
                if ((r12 and 16) !== 0) -1 else 0,
                `ProfileFragment$setOnClickView$6$1`(`this$0`)
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setOnClickView$lambda-6  reason: not valid java name */
        fun `m8747setOnClickView$lambda6`(`this$0`: ProfileFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val baseActivity: BaseActivity? = `this$0`.getActivity() as BaseActivity?
            if (baseActivity != null) {
                baseActivity.showDialogUpgrade()
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setOnClickView$lambda-7  reason: not valid java name */
        fun `m8748setOnClickView$lambda7`(`this$0`: ProfileFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val baseActivity: BaseActivity? = `this$0`.getActivity() as BaseActivity?
            if (baseActivity != null) {
                baseActivity.showDialogKeyUpgrade()
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setOnClickView$lambda-8  reason: not valid java name */
        fun `m8749setOnClickView$lambda8`(`this$0`: ProfileFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            DownloadFragment.Companion.Companion.push(`this$0`.getActivity())
        }
    }
}