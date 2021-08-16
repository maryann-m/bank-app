package com.ekenya.rnd.etourism.ui.wallet.mycards

import android.os.Build
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.ekenya.rnd.etourism.databinding.MyCardsFragmentBinding

import com.rnd.digitaltourismcard.ui.wallet.mycards.MyCardsViewModel


class MyCardsFragment : Fragment() {

    private lateinit var myCardsViewModel: MyCardsViewModel


    private var _binding: MyCardsFragmentBinding? = null


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


        myCardsViewModel =
            ViewModelProvider(this).get(MyCardsViewModel::class.java)

        _binding = MyCardsFragmentBinding.inflate(inflater, container, false)




        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

}