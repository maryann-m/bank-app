package com.ekenya.rnd.etourism.ui.wallet.pin

import android.content.Context
import android.content.SharedPreferences
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
import com.ekenya.rnd.etourism.databinding.PinFragmentBinding
import javax.inject.Inject


class PinFragment : BaseDaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory
    private  var pinViewModel: PinViewModel? = null

    private val sharedPrefFile = "tourismdata"

    private var _binding: PinFragmentBinding? = null


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


        pinViewModel =
            ViewModelProvider(this,viewModelFactory).get(PinViewModel::class.java)

        _binding = PinFragmentBinding.inflate(inflater, container, false)

        val sharedPreferences: SharedPreferences = requireActivity().getSharedPreferences(sharedPrefFile,
            Context.MODE_PRIVATE)

        binding.btnsetpin.setOnClickListener{
            /*val editor:SharedPreferences.Editor =  sharedPreferences.edit()
            editor.putBoolean("hasSetPin",true)
            editor.apply()
            editor.commit()*/
            Navigation.findNavController(it).navigate(R.id.action_pinFragment_to_intermediateFragment)
        }




        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

}