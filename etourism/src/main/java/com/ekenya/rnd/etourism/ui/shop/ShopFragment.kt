package com.ekenya.rnd.etourism.ui.shop

import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import com.ekenya.rnd.common.abstractions.BaseDaggerFragment
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.adapters.CategoryItemsAdapter
import com.ekenya.rnd.etourism.adapters.ShopAdapter
import com.ekenya.rnd.etourism.adapters.SliderAdapter
import com.ekenya.rnd.etourism.databinding.FragmentShopBinding
import com.ekenya.rnd.etourism.models.ShopCategoryItem
import com.ekenya.rnd.etourism.models.ShopItem
import com.ekenya.rnd.etourism.ui.AppData
import javax.inject.Inject

class ShopFragment : BaseDaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory

    private  var shopViewModel: ShopViewModel? = null
    private lateinit var rvAdapter: CategoryItemsAdapter

    private var _binding: FragmentShopBinding? = null
    private  lateinit var dotsLayout: LinearLayout

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        shopViewModel =
            ViewModelProvider(requireActivity(),viewModelFactory).get(ShopViewModel::class.java)

        _binding = FragmentShopBinding.inflate(inflater, container, false)
        val root: View = binding.root
        //toolbar

        val shopCategories:List<ShopCategoryItem> = AppData().getcatogoryList()
        rvAdapter = CategoryItemsAdapter(shopCategories)
        val rv= binding.shopcategoryRecyclerview
        rv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL ,false)
        rv.adapter = rvAdapter
        val shopItemsRecyvlerview = binding.shopitemsRecyclerview
        shopItemsRecyvlerview.layoutManager = GridLayoutManager(context,2)
        val shopItems:List<ShopItem> = AppData().getShopItemsList()
        shopItemsRecyvlerview.adapter = ShopAdapter(shopItems)
        val sliderAdapter = SliderAdapter(
            context,
            AppData()
        )
        binding.shopViewPager.adapter = sliderAdapter
        dotsLayout = binding.dots
        addDots(0)
        binding.shopViewPager.addOnPageChangeListener(changeListener)

        /*val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        return root
    }






    private fun addDots(position: Int) {
        val dots = arrayOfNulls<TextView>(3)
        dotsLayout.removeAllViews()
        for (i in dots.indices) {
            dots[i] = TextView(context)
            dots[i]!!.text = Html.fromHtml("&#8226")
            dots[i]!!.textSize = 30f
            dots[i]!!.setTextColor(resources.getColor(R.color.black))
            dotsLayout.addView(dots[i])
        }
        dots[position]!!.setTextColor(resources.getColor(R.color.app_red))

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    var changeListener: ViewPager.OnPageChangeListener = object : ViewPager.OnPageChangeListener {
        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) {
        }

        override fun onPageSelected(position: Int) {
            addDots(position)
            /*int[] headings = {
                    R.string.member_can_generate_member_statement,
                    R.string.member_can_track_n_claim_payment_status_n_through_the_portal,
                    R.string.request_data_change_n_through_the_portal
            };
            binding.textView.setText(headings[position]);*/
        }

        override fun onPageScrollStateChanged(state: Int) {}
    }

}