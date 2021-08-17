package com.ekenya.rnd.etourism.ui.home.cart.checkout

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.databinding.CheckoutFragmentBinding
import com.ekenya.rnd.etourism.databinding.ShopitemDetailBinding

class CheckoutFragment : Fragment() {

    private var _binding: CheckoutFragmentBinding? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var viewModel: CheckoutViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CheckoutFragmentBinding.inflate(inflater, container, false)
        binding.checkoutbtn.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_checkoutFragment_to_trackOrderFragment)
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CheckoutViewModel::class.java)
        // TODO: Use the ViewModel
    }

}