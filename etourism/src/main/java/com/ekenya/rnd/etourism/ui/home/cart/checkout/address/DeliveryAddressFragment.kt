package com.ekenya.rnd.etourism.ui.home.cart.checkout.address

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ekenya.rnd.etourism.R


    companion object {class DeliveryAddressFragment : Fragment() {

        fun newInstance() = DeliveryAddressFragment()
    }

    private lateinit var viewModel: DeliveryAddressViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.delivery_address_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DeliveryAddressViewModel::class.java)
        // TODO: Use the ViewModel
    }

}