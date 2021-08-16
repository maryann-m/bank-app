package com.ekenya.rnd.etourism.ui.home

import android.graphics.Color
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.viewpager.widget.ViewPager
import com.ekenya.rnd.common.abstractions.BaseDaggerFragment
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.adapters.SliderAdapter
import com.ekenya.rnd.etourism.databinding.FragmentHomeBinding
import com.ekenya.rnd.etourism.ui.AppData
import javax.inject.Inject

class HomeFragment : BaseDaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory
    private lateinit var dotsLayout: LinearLayout

    private var homeViewModel: HomeViewModel? = null
    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        requireActivity().window.apply {
            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS or WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
            decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

            navigationBarColor = ContextCompat.getColor(requireContext(), R.color.white)
            statusBarColor = Color.TRANSPARENT
        }
        homeViewModel = ViewModelProvider(requireActivity(), viewModelFactory!!).get(
            HomeViewModel::class.java
        )

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        dotsLayout = binding.dots
        addDots(0)
        binding.viewPager.addOnPageChangeListener(changeListener)

        val sliderAdapter = SliderAdapter(
            context,
            AppData().getImages()
        )
        binding.viewPager.adapter = sliderAdapter


        //onclicklisterners
        binding.cardView.setOnClickListener {

            Navigation.findNavController(it)
                .navigate(R.id.action_navigation_home_to_personalTripsFragment)

        }
        binding.learnKenyaBtn.setOnClickListener {

            Navigation.findNavController(it)
                .navigate(R.id.action_navigation_home_to_bibleKenyaFragment)

        }
        binding.virtualsafaribtn.setOnClickListener {

            Navigation.findNavController(it)
                .navigate(R.id.action_navigation_home_to_virtualSafariFragment)

        }
        binding.bag.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_navigation_home_to_myBagFragment)
        })
        binding.message.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_navigation_home_to_messagesFragment)
        }



        return binding.root
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
    var changeListener: ViewPager.OnPageChangeListener = object : ViewPager.OnPageChangeListener {
        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) {
        }

        override fun onPageSelected(position: Int) {
            addDots(position)
            val regions = arrayListOf<String>(
                "Mara Serena", "Mara  Serena 2 ", "Mara Serena 3"
            )

            val titles = arrayListOf<String>(
                "Maasai Mara National Park",
                "Serengeti Mara National Park ",
                "Nairobi  National Park"
            )
            var dates = arrayListOf<String>(
                "12 December 2021", "01 January 2013", "01 July 2019"
            )
            binding.regionTitle.text = regions[position]
            binding.tripTitle.text = titles[position]
            binding.date.text = dates[position]
        }

        override fun onPageScrollStateChanged(state: Int) {}
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}