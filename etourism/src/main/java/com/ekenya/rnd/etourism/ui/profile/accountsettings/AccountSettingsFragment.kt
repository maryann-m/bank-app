package com.ekenya.rnd.etourism.ui.profile.accountsettings

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
import com.ekenya.rnd.etourism.databinding.AccountsettingsBinding
import javax.inject.Inject


class AccountSettingsFragment : BaseDaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory
    private lateinit var accountSettingsViewModel: AccountSettingsViewModel


    private var _binding: AccountsettingsBinding? = null


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


        accountSettingsViewModel =
            ViewModelProvider(this,viewModelFactory).get(AccountSettingsViewModel::class.java)

        _binding = AccountsettingsBinding.inflate(inflater, container, false)
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