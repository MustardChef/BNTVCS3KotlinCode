package com.phimhd

import android.view.LayoutInflater

/* loaded from: classes4.dex */
class AdapterUpgradeItem : PagerAdapter() {
    // androidx.viewpager.widget.PagerAdapter
    @get:Override
    val count: Int
        // androidx.viewpager.widget.PagerAdapter
        get() = 3

    @Override // androidx.viewpager.widget.PagerAdapter
    override fun getPageWidth(i: Int): Float {
        return 0.95f
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    override fun isViewFromObject(view: View, obj: Object): Boolean {
        return view === obj
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    override fun instantiateItem(viewGroup: ViewGroup, i: Int): Object {
        var config: Config
        val inflate: View = LayoutInflater.from(viewGroup.getContext())
            .inflate(R.layout.layout_upgrade_item, viewGroup, false)
        val textView: TextView = inflate.findViewById(R.id.tvPricing) as TextView
        val textView2: TextView = inflate.findViewById(R.id.tvUnit) as TextView
        val textView3: TextView = inflate.findViewById(R.id.tvExpire) as TextView
        val imageView: ImageView = inflate.findViewById(R.id.imgBackground) as ImageView
        var string: String = inflate.getContext().getString(R.string.default_premium_price)
        var string2: String = inflate.getContext().getString(R.string.default_unlimited_price)
        var string3: String = inflate.getContext().getString(R.string.unlimited)
        var string4: String = inflate.getContext().getString(R.string.peryear)
        if (AppController.Companion.Companion.getInstance()
                .getConfig() != null && AppController.Companion.Companion.getInstance().getConfig()
                .also {
                    config = it
                } != null && config.getPremium() != null && config.getUnlimited() != null
        ) {
            val split: Array<String> = config.getPremium().split(",")
            val split2: Array<String> = config.getUnlimited().split(",")
            if (split.size > 1) {
                string = split[0]
                string4 = split[1]
            }
            if (split2.size > 1) {
                string2 = split2[0]
                string3 = split2[1]
            }
        }
        if (i == 0) {
            textView.setText(inflate.getContext().getString(R.string.free_text))
            textView2.setVisibility(8)
            textView3.setVisibility(8)
            imageView.setImageResource(R.drawable.bg_standart)
        } else if (i == 1) {
            textView.setText(string)
            textView2.setVisibility(0)
            textView3.setVisibility(0)
            textView3.setText(string4)
            imageView.setImageResource(R.drawable.bg_standart)
        } else if (i == 2) {
            textView.setText(string2)
            textView2.setVisibility(0)
            textView3.setVisibility(0)
            textView3.setText(string3)
            imageView.setImageResource(R.drawable.bg_unlimited)
        }
        viewGroup.addView(inflate)
        return inflate
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    override fun destroyItem(viewGroup: ViewGroup, i: Int, obj: Object) {
        viewGroup.removeView(obj as View)
    }
}