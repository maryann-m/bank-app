package com.ekenya.rnd.etourism.ui.wallet.savings

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
import com.ekenya.rnd.etourism.databinding.SavingsAccountFragmentBinding
import com.ekenya.rnd.etourism.ui.AppData
import com.ekenya.rnd.etourism.adapters.HistoryAdapter

import javax.inject.Inject


class SavingsAccountFragment : BaseDaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory

    private  var savingsAccountViewModel: SavingsAccountViewModel? = null
    private lateinit var  historyAdapter: HistoryAdapter


    private var _binding: SavingsAccountFragmentBinding? = null


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


        savingsAccountViewModel =
            ViewModelProvider(this,viewModelFactory).get(SavingsAccountViewModel::class.java)

        _binding = SavingsAccountFragmentBinding.inflate(inflater, container, false)

        historyAdapter = HistoryAdapter(AppData().getHistoryitems())

        val recyclerView = binding.historyRecyclerview
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter = historyAdapter
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