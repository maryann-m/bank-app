package com.ekenya.rnd.etourism.ui.home.personaltrips

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
import com.ekenya.rnd.etourism.databinding.PersonalTripsFragmentBinding
import javax.inject.Inject

class PersonalTripsFragment : BaseDaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory

    private  var personalTripsViewModel: PersonalTripsViewModel? = null


    private var _binding: PersonalTripsFragmentBinding? = null


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


        personalTripsViewModel =
            ViewModelProvider(this,viewModelFactory).get(PersonalTripsViewModel::class.java)

        _binding = PersonalTripsFragmentBinding.inflate(inflater, container, false)
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