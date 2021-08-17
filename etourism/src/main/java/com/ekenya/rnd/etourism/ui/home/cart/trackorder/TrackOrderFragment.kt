package com.ekenya.rnd.etourism.ui.home.cart.trackorder

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ekenya.rnd.common.abstractions.BaseDaggerFragment
import com.ekenya.rnd.etourism.R
import javax.inject.Inject

class TrackOrderFragment : Fragment() {

    companion object {
        fun newInstance() = TrackOrderFragment()
    }



      var viewModel: TrackOrderViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.track_order_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TrackOrderViewModel::class.java)
        // TODO: Use the ViewModel
    }

}