package com.ekenya.rnd.etourism.ui.wallet.mpesa

import android.os.Build
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.Navigation
import com.ekenya.rnd.common.abstractions.BaseDaggerFragment
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.databinding.MpesaFragmentBinding

import javax.inject.Inject


class MpesaFragment : BaseDaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory

    private  var mpesaViewModel: MpesaViewModel? = null


    private var _binding: MpesaFragmentBinding? = null


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


        mpesaViewModel =
            ViewModelProvider(this,viewModelFactory).get(MpesaViewModel::class.java)

        _binding = MpesaFragmentBinding.inflate(inflater, container, false)
        binding.closeIcon.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mpesaFragment_to_topUpFragment)        })




        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

}