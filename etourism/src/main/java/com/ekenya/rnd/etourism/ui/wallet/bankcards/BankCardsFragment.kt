package com.ekenya.rnd.etourism.ui.wallet.bankcards

import android.os.Build
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.Navigation
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.databinding.BankCardsFragmentBinding


class BankCardsFragment : Fragment() {

    private lateinit var bankCardsViewModel: BankCardsViewModel


    private var _binding: BankCardsFragmentBinding? = null


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


        bankCardsViewModel =
            ViewModelProvider(this).get(BankCardsViewModel::class.java)

        _binding = BankCardsFragmentBinding.inflate(inflater, container, false)
        binding.closeIcon.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_bankCardsFragment_to_topUpFragment)        })




        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

}