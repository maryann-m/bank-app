package com.ekenya.rnd.etourism.ui.profile.registereduser

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ekenya.rnd.etourism.R


class RegisteredUserFragment : Fragment() {

    companion object {
        fun newInstance() = RegisteredUserFragment()
    }

    private lateinit var viewModel: RegisteredUserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.registered_user_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegisteredUserViewModel::class.java)
        // TODO: Use the ViewModel
    }

}