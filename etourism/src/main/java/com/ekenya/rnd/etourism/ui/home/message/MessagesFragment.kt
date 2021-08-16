package com.ekenya.rnd.etourism.ui.home.message

import android.os.Build
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.ekenya.rnd.etourism.databinding.MessagesFragmentBinding
import com.rnd.digitaltourismcard.ui.home.message.MessagesViewModel

class MessagesFragment : Fragment() {

    private lateinit var messagesViewModel: MessagesViewModel


    private var _binding: MessagesFragmentBinding? = null


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


        messagesViewModel =
            ViewModelProvider(this).get(MessagesViewModel::class.java)

        _binding = MessagesFragmentBinding.inflate(inflater, container, false)




        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

}