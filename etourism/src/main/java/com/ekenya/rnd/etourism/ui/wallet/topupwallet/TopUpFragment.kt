package com.ekenya.rnd.etourism.ui.wallet.topupwallet

import android.os.Build
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import com.ekenya.rnd.common.abstractions.BaseDaggerFragment
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.databinding.TopUpFragmentBinding
import com.ekenya.rnd.etourism.ui.AppData
import com.ekenya.rnd.etourism.adapters.PaymentsOptionsAdapter
import javax.inject.Inject


class TopUpFragment : BaseDaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory

    private  var topUpViewModel: TopUpViewModel? = null
    private lateinit var  paymentsOptionsAdapter: PaymentsOptionsAdapter


    private var _binding: TopUpFragmentBinding? = null


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


        topUpViewModel =
            ViewModelProvider(this,viewModelFactory).get(TopUpViewModel::class.java)

        _binding = TopUpFragmentBinding.inflate(inflater, container, false)
        paymentsOptionsAdapter =  PaymentsOptionsAdapter(AppData().getPaymentOptionsList())
        val recyclerView = binding.paymentsoptionrecyclerview
        recyclerView.layoutManager = GridLayoutManager(context, 2)
        recyclerView.adapter = paymentsOptionsAdapter
        binding.closeIcon.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(it).popBackStack()
        })




        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

}