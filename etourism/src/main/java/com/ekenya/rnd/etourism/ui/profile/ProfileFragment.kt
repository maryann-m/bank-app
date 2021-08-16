package com.ekenya.rnd.etourism.ui.profile


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.databinding.ProfileFragmentBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class ProfileFragment : DaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory

    private var _binding: ProfileFragmentBinding? = null

    private val binding get() = _binding!!

    private lateinit var viewModel: ProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ProfileFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(requireActivity(),viewModelFactory).get(ProfileViewModel::class.java)

            binding.settingsbtn.setOnClickListener{
                Navigation.findNavController(it).navigate(R.id.action_navigation_profile_to_accountSettingsFragment)
            }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}