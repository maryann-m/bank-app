package com.ekenya.rnd.etourism.ui.wallet;

import com.ekenya.rnd.common.abstractions.BaseDaggerFragment

import android.content.Context
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.databinding.FragmentWalletBinding
import javax.inject.Inject

import kotlin.properties.Delegates


class NotificationsFragment : BaseDaggerFragment() {
    @Inject
    public lateinit  var viewModelFactory: ViewModelProvider.Factory

    private  var walletViewModel: WalletViewModel? = null
    private var hasSetPin by Delegates.notNull<Boolean>()
    private val sharedPrefFile = "tourismdata"

    private var _binding: FragmentWalletBinding? = null


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


        walletViewModel =
            ViewModelProvider(this,viewModelFactory).get(WalletViewModel::class.java)

        _binding = FragmentWalletBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val sharedPreferences: SharedPreferences = requireActivity().getSharedPreferences(sharedPrefFile,
            Context.MODE_PRIVATE)
        hasSetPin =  sharedPreferences.getBoolean("hasSetPin",false)

        if (hasSetPin) {
            parentFragment?.findNavController()?.navigate(R.id.action_navigation_notifications_to_intermediateFragment)

        } else {
            parentFragment?.findNavController()?.navigate(R.id.action_navigation_notifications_to_pinFragment)


        }



        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

}