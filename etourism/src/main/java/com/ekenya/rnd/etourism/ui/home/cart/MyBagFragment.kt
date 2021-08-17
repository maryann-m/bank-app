package com.ekenya.rnd.etourism.ui.home.cart

import android.os.Build
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.viewpager.widget.ViewPager
import com.ekenya.rnd.etourism.adapters.SectionsPagerAdapter
import com.ekenya.rnd.etourism.databinding.MyBagFragmentBinding
import com.google.android.material.tabs.TabLayout
import com.rnd.digitaltourismcard.ui.home.bag.MyBagViewModel


class MyBagFragment : Fragment() {

    private lateinit var myBagViewModel: MyBagViewModel


    private var _binding: MyBagFragmentBinding? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        myBagViewModel =
            ViewModelProvider(this).get(MyBagViewModel::class.java)

        _binding = MyBagFragmentBinding.inflate(inflater, container, false)
        val sectionsPagerAdapter = parentFragment?.parentFragmentManager?.let {
            context?.let { it1 ->
                SectionsPagerAdapter(
                    it1,
                    it
                )
            }
        }
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)






        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

}