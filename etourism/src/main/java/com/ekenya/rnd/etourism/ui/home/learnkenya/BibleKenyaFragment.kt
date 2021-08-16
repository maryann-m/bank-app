package com.ekenya.rnd.etourism.ui.home.learnkenya

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.ekenya.rnd.common.abstractions.BaseDaggerFragment
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.databinding.BibleKenyaFragmentBinding
import javax.inject.Inject


class BibleKenyaFragment : BaseDaggerFragment() {

    @Inject
     lateinit  var viewModelFactory: ViewModelProvider.Factory

    private  var bibleKenyaViewModel: BibleKenyaViewModel? = null


    private var _binding: BibleKenyaFragmentBinding? = null


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
        requireActivity().window.apply {
            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS or WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
            decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

            navigationBarColor = ContextCompat.getColor(requireContext(), R.color.white)
            statusBarColor = Color.TRANSPARENT}

        bibleKenyaViewModel =
            ViewModelProvider(this,viewModelFactory).get(BibleKenyaViewModel::class.java)

        _binding = BibleKenyaFragmentBinding.inflate(inflater, container, false)
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