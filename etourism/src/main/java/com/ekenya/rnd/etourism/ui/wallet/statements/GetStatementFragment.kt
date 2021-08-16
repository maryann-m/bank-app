package com.ekenya.rnd.etourism.ui.wallet.statements

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
import com.ekenya.rnd.etourism.databinding.GetStatementFragmentBinding
import javax.inject.Inject


class GetStatementFragment : BaseDaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory

    private  var getStatementViewModel: GetStatementViewModel? = null


    private var _binding: GetStatementFragmentBinding? = null


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


        getStatementViewModel =
            ViewModelProvider(this,viewModelFactory).get(GetStatementViewModel::class.java)

        _binding = GetStatementFragmentBinding.inflate(inflater, container, false)
        binding.closeIcon.setOnClickListener{
            Navigation.findNavController(it).popBackStack()
        }




        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

}