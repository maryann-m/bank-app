package com.ekenya.rnd.etourism.ui.home.cart.checkout.payments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ekenya.rnd.etourism.R

class PaymentsStepFragment : Fragment() {

    companion object {
        fun newInstance() = PaymentsStepFragment()
    }

    private lateinit var viewModel: PaymentsStepViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.payments_step_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PaymentsStepViewModel::class.java)
        // TODO: Use the ViewModel
    }

}