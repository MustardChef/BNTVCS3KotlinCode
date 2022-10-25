package com.phimhd

import android.content.BroadcastReceiver
import androidx.fragment.app.Fragment
import com.lagradost.cloudstream3.p041ui.quicksearch.QuickSearchFragment
import com.lagradost.cloudstream3.utils.AppUtils
import kotlin.jvm.internal.Intrinsics

/* compiled from: BaseFragment.kt */
@Metadata(
    m108d1 = ["\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000cH\u0016J\b\u0010\u0010\u001a\u00020\u000cH\u0016J\b\u0010\u0011\u001a\u00020\u000cH\u0016J\u000e\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u000c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\b\u0010\u0018\u001a\u00020\u000cH\u0002J\b\u0010\u0019\u001a\u00020\u000cH\u0002J\u000c\u0010\u001a\u001a\u00020\u000c*\u00020\u001bH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"],
    m107d2 = ["Lcom/phimhd/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "iCallbackDialogFilter", "Lcom/phimhd/ICallbackDialogFilter;", "getICallbackDialogFilter", "()Lcom/phimhd/ICallbackDialogFilter;", "setICallbackDialogFilter", "(Lcom/phimhd/ICallbackDialogFilter;)V", "receiver", "Landroid/content/BroadcastReceiver;", "onAttach", "", "context", "Landroid/content/Context;", "onDetach", "onPause", "onResume", "setUpActionHeaderMovieHomeScreen", "random", "Lcom/lagradost/cloudstream3/SearchResponse;", "setUpPageHomeScreen", "d", "Lcom/lagradost/cloudstream3/HomePageResponse;", "updateKeyToUI", "upgradeBtnClick", "setUpHomeScreenWithPhimHD", "Lcom/lagradost/cloudstream3/ui/home/HomeFragment;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class BaseFragment : Fragment() {
    var iCallbackDialogFilter: ICallbackDialogFilter? = null
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    private val receiver: BroadcastReceiver = object : BroadcastReceiver() {
        // from class: com.phimhd.BaseFragment$receiver$1
        @Override // android.content.BroadcastReceiver
        fun onReceive(context: Context?, intent: Intent?) {
            Intrinsics.checkNotNullParameter(context, "context")
            Intrinsics.checkNotNullParameter(intent, "intent")
            updateKeyToUI()
        }
    }

    fun `_$_clearFindViewByIdCache`() {
        `_$_findViewCache`.clear()
    }

    fun `_$_findCachedViewById`(i: Int): View? {
        var findViewById: View?
        val map: Map<Integer, View> = `_$_findViewCache`
        val view: View? = map[Integer.valueOf(i)]
        if (view == null) {
            val view2: View? = getView()
            if (view2 == null || view2.findViewById(i).also { findViewById = it } == null) {
                return null
            }
            map.put(Integer.valueOf(i), findViewById)
            return findViewById
        }
        return view
    }

    @Override // androidx.fragment.app.Fragment
    /* synthetic */  override fun onDestroyView() {
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */ /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */ /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */ /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */ /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun setUpHomeScreenWithPhimHD(r9: HomeFragment?) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.phimhd.BaseFragment.setUpHomeScreenWithPhimHD(com.lagradost.cloudstream3.ui.home.HomeFragment):void")
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */ /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun setUpPageHomeScreen(r6: HomePageResponse?) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            if (r6 == 0) goto L2d
            java.util.List r2 = r6.getListGenre()
            if (r2 == 0) goto L2d
            int r3 = com.lagradost.cloudstream3.C4761R.C4764id.tvGenre
            android.view.View r3 = r5._$_findCachedViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 != 0) goto L15
            goto L18
        L15:
            r3.setVisibility(r0)
        L18:
            int r3 = com.lagradost.cloudstream3.C4761R.C4764id.tvGenre
            android.view.View r3 = r5._$_findCachedViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L2d
            com.phimhd.-$$Lambda$BaseFragment$YrxBw0LjNUhVQEpEuNcIPPzMKXM r4 = new com.phimhd.-$$Lambda$BaseFragment$YrxBw0LjNUhVQEpEuNcIPPzMKXM
            r4.<init>()
            r3.setOnClickListener(r4)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto L2e
        L2d:
            r2 = r1
        L2e:
            r3 = 8
            if (r2 != 0) goto L40
            int r2 = com.lagradost.cloudstream3.C4761R.C4764id.tvGenre
            android.view.View r2 = r5._$_findCachedViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 != 0) goto L3d
            goto L40
        L3d:
            r2.setVisibility(r3)
        L40:
            if (r6 == 0) goto L6b
            java.util.List r2 = r6.getListCountry()
            if (r2 == 0) goto L6b
            int r4 = com.lagradost.cloudstream3.C4761R.C4764id.tvCountry
            android.view.View r4 = r5._$_findCachedViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 != 0) goto L53
            goto L56
        L53:
            r4.setVisibility(r0)
        L56:
            int r0 = com.lagradost.cloudstream3.C4761R.C4764id.tvCountry
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L6b
            com.phimhd.-$$Lambda$BaseFragment$YoDMbsfYho0IuweaxSpOsFisF44 r1 = new com.phimhd.-$$Lambda$BaseFragment$YoDMbsfYho0IuweaxSpOsFisF44
            r1.<init>()
            r0.setOnClickListener(r1)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r1 = r6
        L6b:
            if (r1 != 0) goto L7b
            int r6 = com.lagradost.cloudstream3.C4761R.C4764id.tvCountry
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 != 0) goto L78
            goto L7b
        L78:
            r6.setVisibility(r3)
        L7b:
            return
        */
        throw UnsupportedOperationException("Method not decompiled: com.phimhd.BaseFragment.setUpPageHomeScreen(com.lagradost.cloudstream3.HomePageResponse):void")
    }

    fun setUpActionHeaderMovieHomeScreen(random: SearchResponse) {
        var str: String?
        var listBannerHome: List<Banner>
        Intrinsics.checkNotNullParameter(random, "random")
        val companion: AppController = AppController.Companion.Companion.getInstance()
        var z = true
        if (companion != null && companion.listBannerHome.also { listBannerHome = it } != null) {
            val list = listBannerHome
            if (!list.isEmpty()) {
                val banner = CollectionsKt.random(list, Random.Default) as Banner
                val materialButton: MaterialButton? =
                    `_$_findCachedViewById`(C4761R.C4764id.home_main_play) as MaterialButton?
                if (materialButton != null) {
                    materialButton.setOnClickListener(object : OnClickListener() {
                        // from class: com.phimhd.-$$Lambda$BaseFragment$VhrLiiAOlqxvMspquIWEPCWf9oM
                        @Override // android.view.View.OnClickListener
                        fun onClick(view: View?) {
                            `m9041setUpActionHeaderMovieHomeScreen$lambda19$lambda16`(
                                this@BaseFragment,
                                banner,
                                view
                            )
                        }
                    })
                }
                val materialButton2: MaterialButton? =
                    `_$_findCachedViewById`(C4761R.C4764id.home_main_info) as MaterialButton?
                if (materialButton2 != null) {
                    materialButton2.setOnClickListener(object : OnClickListener() {
                        // from class: com.phimhd.-$$Lambda$BaseFragment$9R7QrvYCAvNrn8mAWRGqy-tHWk8
                        @Override // android.view.View.OnClickListener
                        fun onClick(view: View?) {
                            `m9042setUpActionHeaderMovieHomeScreen$lambda19$lambda17`(
                                this@BaseFragment,
                                banner,
                                view
                            )
                        }
                    })
                }
                val materialButton3: MaterialButton? =
                    `_$_findCachedViewById`(C4761R.C4764id.home_main_save) as MaterialButton?
                if (materialButton3 != null) {
                    materialButton3.setOnClickListener(object : OnClickListener() {
                        // from class: com.phimhd.-$$Lambda$BaseFragment$oHUf2RHOfOSuiyniTLgC5fgl0lQ
                        @Override // android.view.View.OnClickListener
                        fun onClick(view: View?) {
                            `m9043setUpActionHeaderMovieHomeScreen$lambda19$lambda18`(
                                this@BaseFragment,
                                banner,
                                view
                            )
                        }
                    })
                }
                val imageView: ImageView? =
                    `_$_findCachedViewById`(C4761R.C4764id.posterBlurHeader) as ImageView?
                if (imageView != null) {
                    UIHelper.`setImage$default`(
                        UIHelper.INSTANCE,
                        imageView,
                        banner.urlPhoto,
                        null,
                        null,
                        6,
                        null
                    )
                }
                val imageView2: ImageView? =
                    `_$_findCachedViewById`(C4761R.C4764id.home_main_poster) as ImageView?
                if (imageView2 != null) {
                    UIHelper.`setImage$default`(
                        UIHelper.INSTANCE,
                        imageView2,
                        banner.logo,
                        null,
                        null,
                        6,
                        null
                    )
                }
                val imageView3: ImageView? =
                    `_$_findCachedViewById`(C4761R.C4764id.home_main_poster) as ImageView?
                if (imageView3 != null) {
                    imageView3.setScaleType(ImageView.ScaleType.FIT_END)
                }
                val textView: TextView =
                    `_$_findCachedViewById`(C4761R.C4764id.home_main_text) as TextView?
                        ?: return
                textView.setText(banner.title)
                return
            }
        }
        val materialButton4: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.home_main_play) as MaterialButton?
        if (materialButton4 != null) {
            materialButton4.setOnClickListener(object : OnClickListener() {
                // from class: com.phimhd.-$$Lambda$BaseFragment$XUagghToWrU0va6Qut3mochxCXA
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m9044setUpActionHeaderMovieHomeScreen$lambda20`(
                        this@BaseFragment,
                        random,
                        view
                    )
                }
            })
        }
        val materialButton5: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.home_main_info) as MaterialButton?
        if (materialButton5 != null) {
            materialButton5.setOnClickListener(object : OnClickListener() {
                // from class: com.phimhd.-$$Lambda$BaseFragment$83Uszjxf1Fb2WUfQrZLNVKav1ZY
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m9045setUpActionHeaderMovieHomeScreen$lambda21`(
                        this@BaseFragment,
                        random,
                        view
                    )
                }
            })
        }
        (`_$_findCachedViewById`(C4761R.C4764id.home_main_save) as MaterialButton?).setOnClickListener(
            object : OnClickListener() {
                // from class: com.phimhd.-$$Lambda$BaseFragment$fX8tPky3NGF-phGXk5GjHzUy1Zg
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m9046setUpActionHeaderMovieHomeScreen$lambda22`(
                        this@BaseFragment,
                        random,
                        view
                    )
                }
            })
        val textView2: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.home_main_text) as TextView?
        if (textView2 != null) {
            val sb = StringBuilder()
            sb.append(random.name)
            if (random is AnimeSearchResponse) {
                val animeSearchResponse: AnimeSearchResponse = random as AnimeSearchResponse
                val dubStatus: EnumSet<DubStatus> = animeSearchResponse.getDubStatus()
                if (dubStatus != null && !dubStatus.isEmpty()) {
                    z = false
                }
                if (!z) {
                    val dubStatus2: EnumSet<DubStatus> = animeSearchResponse.getDubStatus()
                    str = if (dubStatus2 != null) CollectionsKt.`joinToString$default`(
                        dubStatus2,
                        " | ",
                        " • ",
                        null,
                        0,
                        null,
                        `BaseFragment$setUpActionHeaderMovieHomeScreen$5`.Companion.INSTANCE,
                        28,
                        null
                    ) else null
                    sb.append(str)
                    textView2.setText(sb.toString())
                }
            }
            str = ""
            sb.append(str)
            textView2.setText(sb.toString())
        }
        val imageView4: ImageView? =
            `_$_findCachedViewById`(C4761R.C4764id.home_main_poster) as ImageView?
        if (imageView4 != null) {
            UIHelper.`setImage$default`(
                UIHelper.INSTANCE,
                imageView4,
                random.posterUrl,
                null,
                null,
                6,
                null
            )
        }
        val imageView5: ImageView? =
            `_$_findCachedViewById`(C4761R.C4764id.posterBlurHeader) as ImageView?
        if (imageView5 != null) {
            UIHelper.INSTANCE.setImageBlur(
                imageView5,
                random.posterUrl,
                50,
                10,
                random.posterHeaders
            )
        }
        val imageView6: ImageView =
            `_$_findCachedViewById`(C4761R.C4764id.home_main_poster) as ImageView?
                ?: return
        imageView6.setScaleType(ImageView.ScaleType.CENTER_CROP)
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */ /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */ /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun updateKeyToUI() {
        /*
            r4 = this;
            com.phimhd.AppController$Companion r0 = com.phimhd.AppController.Companion
            com.phimhd.AppController r0 = r0.getInstance()
            r1 = 0
            if (r0 == 0) goto Le
            com.phimhd.Key r0 = r0.getKey()
            goto Lf
        Le:
            r0 = r1
        Lf:
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L56
            com.phimhd.AppController$Companion r0 = com.phimhd.AppController.Companion
            com.phimhd.AppController r0 = r0.getInstance()
            if (r0 == 0) goto L20
            com.phimhd.Key r1 = r0.getKey()
        L20:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            boolean r0 = r1.isExpired()
            if (r0 != 0) goto L56
            int r0 = com.lagradost.cloudstream3.C4761R.C4764id.home_key
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L39
            r1 = 2131231546(0x7f08033a, float:1.8079176E38)
            r0.setImageResource(r1)
        L39:
            int r0 = com.lagradost.cloudstream3.C4761R.C4764id.home_key_btn
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 != 0) goto L44
            goto L47
        L44:
            r0.setVisibility(r2)
        L47:
            int r0 = com.lagradost.cloudstream3.C4761R.C4764id.home_key
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 != 0) goto L52
            goto L82
        L52:
            r0.setVisibility(r3)
            goto L82
        L56:
            int r0 = com.lagradost.cloudstream3.C4761R.C4764id.home_key_btn
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 != 0) goto L61
            goto L64
        L61:
            r0.setVisibility(r3)
        L64:
            int r0 = com.lagradost.cloudstream3.C4761R.C4764id.home_key
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 != 0) goto L6f
            goto L72
        L6f:
            r0.setVisibility(r2)
        L72:
            int r0 = com.lagradost.cloudstream3.C4761R.C4764id.home_key
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L82
            r1 = 2131231268(0x7f080224, float:1.8078612E38)
            r0.setImageResource(r1)
        L82:
            int r0 = com.lagradost.cloudstream3.C4761R.C4764id.home_key
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L94
            com.phimhd.-$$Lambda$BaseFragment$B51c4yNNIL0NZKKCxOLLA42R0oU r1 = new com.phimhd.-$$Lambda$BaseFragment$B51c4yNNIL0NZKKCxOLLA42R0oU
            r1.<init>()
            r0.setOnClickListener(r1)
        L94:
            int r0 = com.lagradost.cloudstream3.C4761R.C4764id.home_key_btn
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto La6
            com.phimhd.-$$Lambda$BaseFragment$pRoaGOzZgORtacq5a1BuRHNmu84 r1 = new com.phimhd.-$$Lambda$BaseFragment$pRoaGOzZgORtacq5a1BuRHNmu84
            r1.<init>()
            r0.setOnClickListener(r1)
        La6:
            return
        */
        throw UnsupportedOperationException("Method not decompiled: com.phimhd.BaseFragment.updateKeyToUI():void")
    }

    private fun upgradeBtnClick() {
        val companion: AppController = AppController.Companion.Companion.getInstance()
        if ((if (companion != null) companion.key else null) != null) {
            val companion2: AppController = AppController.Companion.Companion.getInstance()
            val key = if (companion2 != null) companion2.key else null
            Intrinsics.checkNotNull(key)
            if (!key!!.isExpired) {
                (`_$_findCachedViewById`(C4761R.C4764id.home_key) as ImageView?).setImageResource(R.drawable.ic_vip)
                val activity: FragmentActivity = activity
                Objects.requireNonNull(
                    activity,
                    "null cannot be cast to non-null type com.lagradost.cloudstream3.MainActivity"
                )
                (activity as MainActivity).showDialogKeyUpgrade()
                val textView: TextView =
                    `_$_findCachedViewById`(C4761R.C4764id.home_key_btn) as TextView?
                        ?: return
                textView.setVisibility(8)
                return
            }
        }
        (`_$_findCachedViewById`(C4761R.C4764id.home_key) as ImageView?).setImageResource(R.drawable.ic_ad_block__1_)
        val textView2: TextView? = `_$_findCachedViewById`(C4761R.C4764id.home_key_btn) as TextView?
        if (textView2 != null) {
            textView2.setVisibility(0)
        }
        val imageView: ImageView? = `_$_findCachedViewById`(C4761R.C4764id.home_key) as ImageView?
        if (imageView != null) {
            imageView.setVisibility(8)
        }
        val activity2: FragmentActivity = activity
        Objects.requireNonNull(
            activity2,
            "null cannot be cast to non-null type com.lagradost.cloudstream3.MainActivity"
        )
        (activity2 as MainActivity).showDialogUpgrade()
    }

    @Override // androidx.fragment.app.Fragment
    override fun onAttach(context: Context) {
        Intrinsics.checkNotNullParameter(context, "context")
        super.onAttach(context)
        iCallbackDialogFilter = context
    }

    @Override // androidx.fragment.app.Fragment
    override fun onDetach() {
        super.onDetach()
        iCallbackDialogFilter = null
    }

    @Override // androidx.fragment.app.Fragment
    override fun onResume() {
        super.onResume()
        val intentFilter = IntentFilter(Constants.INTENT_UPDATE_KEY)
        val context: Context? = context
        if (context != null) {
            LocalBroadcastManager.getInstance(context).registerReceiver(receiver, intentFilter)
        }
    }

    @Override // androidx.fragment.app.Fragment
    override fun onPause() {
        val context: Context? = context
        if (context != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(receiver)
        }
        super.onPause()
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpHomeScreenWithPhimHD$lambda-2$lambda-1$lambda-0  reason: not valid java name */
        fun `m9047setUpHomeScreenWithPhimHD$lambda2$lambda1$lambda0`(
            this_setUpHomeScreenWithPhimHD: HomeFragment,
            view: View?
        ) {
            var config: Config
            Intrinsics.checkNotNullParameter(
                this_setUpHomeScreenWithPhimHD,
                "\$this_setUpHomeScreenWithPhimHD"
            )
            val companion: AppController = AppController.Companion.Companion.getInstance()
            val str: String? = if (companion == null || companion.config.also {
                    config = it
                } == null) null else config.urlRedirectPoster
            val intent = Intent("android.intent.action.VIEW")
            intent.setData(Uri.parse(str))
            this_setUpHomeScreenWithPhimHD.startActivity(intent)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpHomeScreenWithPhimHD$lambda-6$lambda-5  reason: not valid java name */
        fun `m9048setUpHomeScreenWithPhimHD$lambda6$lambda5`(
            this_setUpHomeScreenWithPhimHD: HomeFragment,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(
                this_setUpHomeScreenWithPhimHD,
                "\$this_setUpHomeScreenWithPhimHD"
            )
            val companion: QuickSearchFragment.Companion = QuickSearchFragment.Companion
            val activity: FragmentActivity = this_setUpHomeScreenWithPhimHD.getActivity()
            val currentApiName: String = this_setUpHomeScreenWithPhimHD.currentApiName
            companion.pushSearch(
                activity,
                "",
                if (currentApiName != null) arrayOf<String>(currentApiName) else null
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpHomeScreenWithPhimHD$lambda-7  reason: not valid java name */
        fun `m9049setUpHomeScreenWithPhimHD$lambda7`(
            this_setUpHomeScreenWithPhimHD: HomeFragment,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(
                this_setUpHomeScreenWithPhimHD,
                "\$this_setUpHomeScreenWithPhimHD"
            )
            LiveTvSportFragment.Companion.pushSearch(this_setUpHomeScreenWithPhimHD.getActivity())
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpPageHomeScreen$lambda-10$lambda-9  reason: not valid java name */
        fun `m9050setUpPageHomeScreen$lambda10$lambda9`(
            `this$0`: BaseFragment,
            list: List?,
            homePageResponse: HomePageResponse,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(list, "\$list")
            val iCallbackDialogFilter = `this$0`.iCallbackDialogFilter
            iCallbackDialogFilter?.showDialogFilter(list, object : ICallback<Any?> {
                // from class: com.phimhd.-$$Lambda$BaseFragment$_u0lx04CZcSHuGRlmpuJz-jLxaw
                @Override // com.lagradost.cloudstream3.p041ui.browser.ICallback
                override fun onCallback(obj: Object) {
                    `m9051setUpPageHomeScreen$lambda10$lambda9$lambda8`(
                        this@BaseFragment,
                        homePageResponse,
                        obj as Page
                    )
                }
            })
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpPageHomeScreen$lambda-10$lambda-9$lambda-8  reason: not valid java name */
        fun `m9051setUpPageHomeScreen$lambda10$lambda9$lambda8`(
            `this$0`: BaseFragment,
            homePageResponse: HomePageResponse,
            page: Page
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Log.d("Blue", "Page " + page.name + ' ' + page.getUrl())
            val textView: TextView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.tvGenre) as TextView?
            if (textView != null) {
                textView.setText(page.name)
            }
            val textView2: TextView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.tvCountry) as TextView?
            if (textView2 != null) {
                var titleMenuCountry: String? = homePageResponse.titleMenuCountry
                if (titleMenuCountry == null) {
                    titleMenuCountry = `this$0`.getString(R.string.menu_country)
                }
                textView2.setText(titleMenuCountry)
            }
            PageBottomSheet.Companion.newInstance(page.getUrl(), page.name, page.getNameApi())
                .show(`this$0`.childFragmentManager, "page")
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpPageHomeScreen$lambda-14$lambda-13  reason: not valid java name */
        fun `m9052setUpPageHomeScreen$lambda14$lambda13`(
            `this$0`: BaseFragment,
            list: List?,
            homePageResponse: HomePageResponse,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(list, "\$list")
            val iCallbackDialogFilter = `this$0`.iCallbackDialogFilter
            iCallbackDialogFilter?.showDialogFilter(list, object : ICallback<Any?> {
                // from class: com.phimhd.-$$Lambda$BaseFragment$A5m9GptVcSxxms8h0c6kslkkLE8
                @Override // com.lagradost.cloudstream3.p041ui.browser.ICallback
                override fun onCallback(obj: Object) {
                    `m9053setUpPageHomeScreen$lambda14$lambda13$lambda12`(
                        this@BaseFragment,
                        homePageResponse,
                        obj as Page
                    )
                }
            })
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpPageHomeScreen$lambda-14$lambda-13$lambda-12  reason: not valid java name */
        fun `m9053setUpPageHomeScreen$lambda14$lambda13$lambda12`(
            `this$0`: BaseFragment,
            homePageResponse: HomePageResponse,
            page: Page
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Log.d("Blue", "Page " + page.name + ' ' + page.getUrl())
            val textView: TextView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.tvGenre) as TextView?
            if (textView != null) {
                var titleMenuGenres: String? = homePageResponse.titleMenuGenres
                if (titleMenuGenres == null) {
                    titleMenuGenres = `this$0`.getString(R.string.menu_genre)
                }
                textView.setText(titleMenuGenres)
            }
            val textView2: TextView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.tvCountry) as TextView?
            if (textView2 != null) {
                textView2.setText(page.name)
            }
            PageBottomSheet.Companion.newInstance(page.getUrl(), page.name, page.getNameApi())
                .show(`this$0`.childFragmentManager, "page")
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpActionHeaderMovieHomeScreen$lambda-19$lambda-16  reason: not valid java name */
        fun `m9041setUpActionHeaderMovieHomeScreen$lambda19$lambda16`(
            `this$0`: BaseFragment,
            randomItem: Banner,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(randomItem, "\$randomItem")
            AppUtils.`loadSearchResult$default`(
                AppUtils.INSTANCE,
                `this$0`.activity,
                ConfigHomeKt.toSearchResponse(randomItem),
                1,
                null,
                4,
                null
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpActionHeaderMovieHomeScreen$lambda-19$lambda-17  reason: not valid java name */
        fun `m9042setUpActionHeaderMovieHomeScreen$lambda19$lambda17`(
            `this$0`: BaseFragment,
            randomItem: Banner,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(randomItem, "\$randomItem")
            AppUtils.`loadSearchResult$default`(
                AppUtils.INSTANCE,
                `this$0`.activity,
                ConfigHomeKt.toSearchResponse(randomItem),
                0,
                null,
                6,
                null
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpActionHeaderMovieHomeScreen$lambda-19$lambda-18  reason: not valid java name */
        fun `m9043setUpActionHeaderMovieHomeScreen$lambda19$lambda18`(
            `this$0`: BaseFragment,
            randomItem: Banner,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(randomItem, "\$randomItem")
            AppUtils.`loadSearchResult$default`(
                AppUtils.INSTANCE,
                `this$0`.activity,
                ConfigHomeKt.toSearchResponse(randomItem),
                9,
                null,
                4,
                null
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpActionHeaderMovieHomeScreen$lambda-20  reason: not valid java name */
        fun `m9044setUpActionHeaderMovieHomeScreen$lambda20`(
            `this$0`: BaseFragment,
            random: SearchResponse?,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(random, "\$random")
            AppUtils.`loadSearchResult$default`(
                AppUtils.INSTANCE,
                `this$0`.activity,
                random,
                1,
                null,
                4,
                null
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpActionHeaderMovieHomeScreen$lambda-21  reason: not valid java name */
        fun `m9045setUpActionHeaderMovieHomeScreen$lambda21`(
            `this$0`: BaseFragment,
            random: SearchResponse?,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(random, "\$random")
            AppUtils.`loadSearchResult$default`(
                AppUtils.INSTANCE,
                `this$0`.activity,
                random,
                0,
                null,
                6,
                null
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpActionHeaderMovieHomeScreen$lambda-22  reason: not valid java name */
        fun `m9046setUpActionHeaderMovieHomeScreen$lambda22`(
            `this$0`: BaseFragment,
            random: SearchResponse?,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(random, "\$random")
            AppUtils.`loadSearchResult$default`(
                AppUtils.INSTANCE,
                `this$0`.activity,
                random,
                9,
                null,
                4,
                null
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: updateKeyToUI$lambda-23  reason: not valid java name */
        fun `m9054updateKeyToUI$lambda23`(`this$0`: BaseFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.upgradeBtnClick()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: updateKeyToUI$lambda-24  reason: not valid java name */
        fun `m9055updateKeyToUI$lambda24`(`this$0`: BaseFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.upgradeBtnClick()
        }
    }
}