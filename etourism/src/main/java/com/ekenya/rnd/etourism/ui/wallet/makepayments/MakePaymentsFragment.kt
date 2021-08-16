package com.ekenya.rnd.etourism.ui.wallet.makepayments

import android.os.Build
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.annotation.RequiresApi
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.ekenya.rnd.common.abstractions.BaseDaggerFragment
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.adapters.PaymentsHistoryAdapter
import com.ekenya.rnd.etourism.databinding.MakePaymentsFragmentBinding
import com.ekenya.rnd.etourism.ui.AppData
import javax.inject.Inject

class MakePaymentsFragment : BaseDaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory

    private  var makePaymentsViewModel: MakePaymentsViewModel? = null
    private lateinit var  paymentsHistoryAdapter: PaymentsHistoryAdapter


    private var _binding: MakePaymentsFragmentBinding? = null


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
        makePaymentsViewModel =
            ViewModelProvider(this,viewModelFactory).get(MakePaymentsViewModel::class.java)

        _binding = MakePaymentsFragmentBinding.inflate(inflater, container, false)
        paymentsHistoryAdapter = PaymentsHistoryAdapter(AppData().getPayments())
        val merchantrecyvlerview = binding.merchantsrv
        merchantrecyvlerview.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        merchantrecyvlerview.adapter= paymentsHistoryAdapter
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