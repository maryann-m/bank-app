package com.ekenya.rnd.etourism.ui.wallet.intermediate

import android.os.Build
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.ekenya.rnd.common.abstractions.BaseDaggerFragment
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.adapters.HistoryAdapter
import com.ekenya.rnd.etourism.databinding.IntermediateFragmentBinding
import com.ekenya.rnd.etourism.ui.AppData
import javax.inject.Inject


class IntermediateFragment : BaseDaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory

    private  var intermediateViewModel: IntermediateViewModel? = null


    private var _binding: IntermediateFragmentBinding? = null


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


        intermediateViewModel =
            ViewModelProvider(this,viewModelFactory).get(IntermediateViewModel::class.java)

        _binding = IntermediateFragmentBinding.inflate(inflater, container, false)
         val rv =binding.historyRecyclerview
      val adapter = HistoryAdapter(AppData().getHistoryitems())
      rv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL ,false)
      rv.adapter = adapter
      binding.makePaymentsButton.setOnClickListener(View.OnClickListener {
          Navigation.findNavController(it).navigate(R.id.action_intermediateFragment_to_makePayments)
      })
      binding.topupwalletTv.setOnClickListener(View.OnClickListener {
          Navigation.findNavController(it).navigate(R.id.action_intermediateFragment_to_topUpFragment)
      })
      binding.savings.setOnClickListener(View.OnClickListener {
          Navigation.findNavController(it).navigate(R.id.action_intermediateFragment_to_savingsAccountFragment)
      })
        binding.statement.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_intermediateFragment_to_getStatementFragment)
        }



        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

}