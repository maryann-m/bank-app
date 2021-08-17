package com.ekenya.rnd.etourism.ui.home.cart.checkout.address

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.databinding.DeliveryAddressFragmentBinding
import com.ekenya.rnd.etourism.databinding.MyBagFragmentBinding
import com.ekenya.rnd.etourism.ui.home.cart.checkout.payments.PaymentsStepFragment


class DeliveryAddressFragment : Fragment() {

    private var _binding: DeliveryAddressFragmentBinding? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    private lateinit var viewModel: DeliveryAddressViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DeliveryAddressFragmentBinding.inflate(inflater,container,false)
        binding.proceedbtn.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_deliveryAddressFragment_to_paymentsStepFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

}