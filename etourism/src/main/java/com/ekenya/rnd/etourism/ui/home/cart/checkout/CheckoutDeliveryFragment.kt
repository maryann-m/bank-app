package com.ekenya.rnd.etourism.ui.home.cart.checkout

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import com.ekenya.rnd.common.abstractions.BaseDaggerFragment
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.ui.profile.accountsettings.AccountSettingsViewModel_Factory
import javax.inject.Inject

class CheckoutDeliveryFragment : BaseDaggerFragment() {
    @Inject
    public lateinit var viewmodelFactory:  ViewModelProvider.Factory




    private  var viewModel: CheckoutDeliveryViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.checkout_delivery_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this,viewmodelFactory).get(CheckoutDeliveryViewModel::class.java)
        // TODO: Use the ViewModel
    }

}